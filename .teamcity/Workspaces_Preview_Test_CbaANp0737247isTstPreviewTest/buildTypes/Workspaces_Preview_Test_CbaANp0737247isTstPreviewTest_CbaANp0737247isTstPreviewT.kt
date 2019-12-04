package Workspaces_Preview_Test_CbaANp0737247isTstPreviewTest.buildTypes

import Workspaces_Preview_Mgmt_CbaANp0737259isTstPreviewMgmt.buildTypes.FoundationWorkspaces_CbaANp0737259isTstPreviewMgmt
import Workspaces_Preview_Test_CbaANp0737247isTstPreviewTest.buildTypes.Workspaces_Preview_Test_CbaANp0737247isTstPreviewTest_Wipe
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

object Workspaces_Preview_Test_CbaANp0737247isTstPreviewTest_CbaANp0737247isTstPreviewT : BuildType({
    uuid = "776e1ee4-5abe-442c-b40c-beadeec1569e"
    extId = "Workspaces_Preview_Test_CbaANp0737247isTstPreviewTest_CbaANp0737247isTstPreviewT"
    name = "cba-a-np-0737247-is-tst-preview_test"
    description = "Test Preview Non-Prod Workspace"

    allowExternalStatus = true
    artifactRules = """
        inventory.log
        deployment.log
    """.trimIndent()
    maxRunningBuilds = 1

    params {
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
        root(Workspaces_Preview_Test_CbaANp0737247isTstPreviewTest.vcsRoots.Workspaces_Preview_Test_CbaANp0737247isTstPreviewTest_CbaANp0737247isTstPrevie_2)

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
            buildTypeExtId = FoundationWorkspaces_CbaANp0737259isTstPreviewMgmt.extId
            successfulOnly = true
            branchFilter = "+:*"
        }
        finishBuildTrigger {
            buildTypeExtId = Workspaces_Preview_Test_CbaANp0737247isTstPreviewTest_Wipe.extId
            successfulOnly = true
            branchFilter = "+:*"
        }
    }

    features {
        commitStatusPublisher {
            publisher = github {
                githubUrl = "https://vcs.cnsga.aws.prod.au.internal.cba/api/v3"
                authType = personalToken {
                    token = "zxx28f7e6ed05e1dfa605f9db70e8fbc5ce424edf9201769c1897fdc43a1f78943690c78d678fd12a30775d03cbe80d301b"
                }
            }
        }
    }

    requirements {
        endsWith("cloud.amazon.agent-name-prefix", "TEAMCITY-AGENT")
        startsWith("cloud.amazon.agent-name-prefix", "cns-ga-prod-oc-mgmt")
    }
})
