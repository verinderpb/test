package Workspaces_Ga_Prod_CbaAPr0737248isPrdGaTest.buildTypes

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

object Workspaces_Ga_Prod_CbaAPr0737248isPrdGaTest_CbaAPr0737248isPrdGaTest : BuildType({
    uuid = "28a94739-384d-4481-b045-1507f28f0d5f"
    extId = "Workspaces_Ga_Prod_CbaAPr0737248isPrdGaTest_CbaAPr0737248isPrdGaTest"
    name = "cba-a-pr-0737248-is-prd-ga_test"
    description = "Test GA PROD Workspace"

    allowExternalStatus = true

    params {
        param("env.TC_AgentAMI", "%system.ec2.ami-id%")
        param("env.TC_AgentName", "%teamcity.agent.name%")
        param("env.TC_BuildBranch", "%teamcity.build.branch%")
        param("env.TC_BuildCommit", "%build.vcs.number%")
        param("env.TC_BuildName", "%system.teamcity.buildConfName%")
        param("env.TC_BuildNum", "%system.build.number%")
        param("env.TC_BuildUser", "%teamcity.build.triggeredBy.username%")
        param("env.TC_PASS", "zxx170b643978738124991cef91f670a7d20e605d981873c6fe")
        param("env.TC_ProjectName", "%system.teamcity.projectName%")
        param("env.TC_USER", "acoe_cnsfs_githubtc")
        param("env.TC_Version", "%system.teamcity.version%")
    }

    vcs {
        root("CbaAPr0737248isPrdGaTest")

        checkoutMode = CheckoutMode.ON_AGENT
        cleanCheckout = true
    }

    steps {
        script {
            name = "Test Step"
            scriptContent = """
                ls -la
                
                ansible --version
                
                #echo git clone -v https://vcs.cnsga.aws.prod.au.internal.cba/CNS/cba-cns-aws-ga-clab-is-oc-test-workspace.git
                
                #git clone -v https://teamcity:54y2yawO%40SfKH9Zg@vcs.cnsga.aws.prod.au.internal.cba/CNS/cba-cns-aws-ga-clab-is-oc-test-workspace.git
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
            buildTypeExtId = "Cns_Deploy_Prod"
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
