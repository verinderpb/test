package Workspaces_Preview_Test_CbaACl0737249isTstPreviewTest.buildTypes

import Undeploy.buildTypes.Undeploy_CleanTenant
import Workspaces_Preview_Mgmt_CbaACl0737258isTstPreviewMgmt.buildTypes.FoundationWorkspaces_CbaACl0737258isTstPreviewMgmt
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.CommitStatusPublisher
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.CommitStatusPublisher.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.commitStatusPublisher
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.FinishBuildTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.FinishBuildTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.finishBuildTrigger

object Workspaces_Preview_Test_CbaACl0737249isTstPreviewTest_CbaACl0737249isTstPreviewT : BuildType({
    uuid = "81273a29-6dd4-4231-9e08-4b6298f82d9d"
    extId = "Workspaces_Preview_Test_CbaACl0737249isTstPreviewTest_CbaACl0737249isTstPreviewT"
    name = "cba-a-cl-0737249-is-tst-preview_test"
    description = "Test Preview CLAB Workspace"

    allowExternalStatus = true
    artifactRules = "inventory.log"
    maxRunningBuilds = 1

    params {
        param("env.HOME", "/root")
        param("env.TC_AgentAMI", "%system.ec2.ami-id%")
        param("env.TC_AgentName", "%teamcity.agent.name%")
        param("env.TC_BuildBranch", "%teamcity.build.branch%")
        param("env.TC_BuildCommit", "%build.vcs.number%")
        param("env.TC_BuildName", "%system.teamcity.buildConfName%")
        param("env.TC_BuildNum", "%system.build.number%")
        param("env.TC_BuildUser", "%teamcity.build.triggeredBy.username%")
        param("env.TC_PASS", "zxx170b643978738124991cef91f670a7d20e605d981873c6fe")
        password("env.TC_PASSWORD", "zxx170b6439787381240e7d0e5cc79ed1a8775d03cbe80d301b", display = ParameterDisplay.HIDDEN)
        param("env.TC_ProjectName", "%system.teamcity.projectName%")
        param("env.TC_USER", "acoe_cnsfs_githubtc")
        param("env.TC_Version", "%system.teamcity.version%")
    }

    vcs {
        root(Workspaces_Preview_Test_CbaACl0737249isTstPreviewTest.vcsRoots.Workspaces_Preview_Test_CbaACl0737249isTstPreviewTest_CbaACl0737249isTstPrevie_3)

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
        finishBuildTrigger {
            enabled = false
            buildTypeExtId = Undeploy_CleanTenant.extId
            branchFilter = "+:*"
        }
        finishBuildTrigger {
            buildTypeExtId = FoundationWorkspaces_CbaACl0737258isTstPreviewMgmt.extId
            successfulOnly = true
        }
    }

    features {
        commitStatusPublisher {
            vcsRootExtId = "CbaACl0838394isLabPreviewTest"
            publisher = github {
                githubUrl = "https://vcs.cnsga.aws.prod.au.internal.cba/api/v3/"
                authType = personalToken {
                    token = "zxx28f7e6ed05e1dfa605f9db70e8fbc5ce424edf9201769c1897fdc43a1f78943690c78d678fd12a30775d03cbe80d301b"
                }
            }
            param("secure:github_password", "zxxb1d2226fa204e41cf5710bb0e551cd86775d03cbe80d301b")
            param("github_username", "teamcity")
        }
    }

    requirements {
        endsWith("cloud.amazon.agent-name-prefix", "TEAMCITY-AGENT")
        startsWith("cloud.amazon.agent-name-prefix", "cns-ga-prod-oc-mgmt")
    }
})
