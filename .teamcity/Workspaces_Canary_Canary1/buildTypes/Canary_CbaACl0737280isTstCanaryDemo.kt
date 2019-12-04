package Workspaces_Canary_Canary1.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.CommitStatusPublisher
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.CommitStatusPublisher.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.commitStatusPublisher
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object Canary_CbaACl0737280isTstCanaryDemo : BuildType({
    uuid = "8d4a8338-c236-49af-bd2c-abc76f307848"
    extId = "Canary_CbaACl0737280isTstCanaryDemo"
    name = "cba-a-cl-0737280-is-tst-canary_demo"
    description = "Canary Nonp Test"


    params {
        param("env.PROXY_PORT", "3128")
        param("env.TC_AgentAMI", "%system.ec2.ami-id%")
        param("env.TC_AgentName", "%teamcity.agent.name%")
        param("env.TC_BuildBranch", "%teamcity.build.branch%")
        param("env.TC_BuildCommit", "%build.vcs.number%")
        param("env.TC_BuildName", "%system.teamcity.buildConfName%")
        param("env.TC_BuildNum", "%system.build.number%")
        param("env.TC_BuildUser", "%teamcity.build.triggeredBy.username%")
        param("env.TC_PASS", "zxx170b643978738124a5c11058131802530e605d981873c6fe")
        param("env.TC_ProjectName", "%system.teamcity.projectName%")
        param("env.TC_USER", "acoe_cnsfs_githubtc")
        param("env.TC_Version", "%system.teamcity.version%")
    }

    vcs {
        root("Canary_CbaACl0737280isTstCanaryDemo")

        checkoutMode = CheckoutMode.ON_AGENT
        cleanCheckout = true
    }

    steps {
        script {
            name = "Test Step"
            scriptContent = """
                ls -l
                #export no_proxy="${'$'}{NO_PROXY}"
                #export HTTPS_PROXY=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                #export HTTP_PROXY=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                #export https_proxy=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                #export http_proxy=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                
                # Setup users and passwords for roles
                #sed -i "s/USER/${'$'}{TC_USER}/g" requirements.yml
                #sed -i "s/PASS/${'$'}{TC_PASS}/g" requirements.yml
                #ansible-galaxy install -c -f -p roles/ -r requirements.yml
                
                ## Validating AWS CF templates
                #for i in roles/*
                #do
                #    for j in ${'$'}i/files/*
                #    do
                #        echo "Testing ${'$'}{j}"
                #        if [[ -f ${'$'}{j} ]] && [[ ! ${'$'}(aws cloudformation validate-template --template-body file://${'$'}{j}) ]];then
                #            echo "Error in ${'$'}{j}"
                #            exit 1
                #        fi
                #    done
                #done
            """.trimIndent()
        }
        script {
            name = "Run Playbook"
            scriptContent = """
                export no_proxy="${'$'}{NO_PROXY}"
                export HTTPS_PROXY=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                export HTTP_PROXY=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                export https_proxy=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                export http_proxy=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                
                #./update_versions.py
                #cat requirements.yml
                echo ${'$'}{BranchName}
                ./launch.sh
            """.trimIndent()
        }
    }

    triggers {
        vcs {
            triggerRules = "+:comment=exec_tc_build:**"
            branchFilter = """
                +:master
                +:develop
                +:CNS-*
            """.trimIndent()
            watchChangesInDependencies = true
        }
    }

    features {
        commitStatusPublisher {
            publisher = github {
                githubUrl = "https://vcs.cnsga.aws.prod.au.internal.cba/api/v3/"
                authType = personalToken {
                    token = "zxx59a101063d2c9c585dd657b8cdbbf474e46cc21fd5e5c4c35830598cf19b055ac3a9bfbc6efde453775d03cbe80d301b"
                }
            }
            param("secure:github_password", "zxxb1d2226fa204e41cf5710bb0e551cd86775d03cbe80d301b")
            param("github_username", "teamcity")
        }
    }

    requirements {
        startsWith("cloud.amazon.agent-name-prefix", "cns-ga-prod-oc-mgmt-TEAMCITY-AGENT")
    }
})
