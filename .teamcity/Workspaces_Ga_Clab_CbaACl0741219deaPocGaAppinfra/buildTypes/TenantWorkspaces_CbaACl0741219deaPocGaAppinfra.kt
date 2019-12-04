package Workspaces_Ga_Clab_CbaACl0741219deaPocGaAppinfra.buildTypes

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

object TenantWorkspaces_CbaACl0741219deaPocGaAppinfra : BuildType({
    uuid = "a86ea666-d59d-4ec5-ae6d-f07ee6c12742"
    extId = "TenantWorkspaces_CbaACl0741219deaPocGaAppinfra"
    name = "cba-a-cl-0741219-dea-poc-ga_appinfra"
    description = "cba-cns-aws-ga-clab-dea-appinfra"

    allowExternalStatus = true
    maxRunningBuilds = 1

    params {
        param("env.PROXY_ADDRESS", "app-proxy.cnsga.aws.prod.au.internal.cba")
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
        root("TenantWorkspaces_CbaACl0741219deaPocGaAppinfra")

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
                
                ./launch.sh
            """.trimIndent()
        }
    }

    triggers {
        finishBuildTrigger {
            buildTypeExtId = "Cns_Deploy_Clab"
            successfulOnly = true
        }
    }

    features {
        commitStatusPublisher {
            publisher = github {
                githubUrl = "https://vcs.cnsga.aws.prod.au.internal.cba/api/v3"
                authType = personalToken {
                    token = "zxxa5a97c83b4cbf9967b0d2e42b4115d80f4fcc81542729bfbd76255bedfbcabeb0e59c4fe0a1dbe47775d03cbe80d301b"
                }
            }
        }
    }

    requirements {
        startsWith("cloud.amazon.agent-name-prefix", "cns-ga-prod-oc-mgmt-TEAMCITY-AGENT")
    }
})
