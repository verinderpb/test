package Workspaces_Preview_Mgmt_CbaACl0737258isTstPreviewMgmt.buildTypes

import Workspaces_Preview_Mgmt_CbaACl0879513isLabPreviewTgw.buildTypes.Workspaces_Preview_Mgmt_CbaACl0879513isLabPreviewTgw_CbaACl0879513isLabPreviewTg
import Workspaces_Preview_Mgmt_CbaANp0737259isTstPreviewMgmt.buildTypes.FoundationWorkspaces_CbaANp0737259isTstPreviewMgmt
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.CommitStatusPublisher
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.CommitStatusPublisher.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.commitStatusPublisher
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.FinishBuildTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.FinishBuildTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.ScheduleTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.ScheduleTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.finishBuildTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.schedule

object FoundationWorkspaces_CbaACl0737258isTstPreviewMgmt : BuildType({
    uuid = "7a870142-3123-4abc-a349-ff1c0dff7e1e"
    extId = "FoundationWorkspaces_CbaACl0737258isTstPreviewMgmt"
    name = "cba-a-cl-0737258-is-tst-preview_mgmt"
    description = "Preview CLAB Mgmt"

    allowExternalStatus = true
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
        param("env.workspace_name", "cba-a-cl-0737258-is-tst-preview_mgmt")
    }

    vcs {
        root("CbaACl0737258isTstPreviewMgmt")

        checkoutMode = CheckoutMode.ON_AGENT
        cleanCheckout = true
    }

    steps {
        script {
            name = "Run Playbook"
            enabled = false
            scriptContent = """
                export no_proxy="${'$'}{NO_PROXY}"
                export HTTPS_PROXY=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                export HTTP_PROXY=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                export https_proxy=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                export http_proxy=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                
                # Setup users and passwords for roles
                sed -i "s/USER/${'$'}{TC_USER}/g" requirements.yml
                sed -i "s/PASS/${'$'}{TC_PASS}/g" requirements.yml
                
                ansible-galaxy install -c -f -p roles/ -r requirements.yml
                ansible-playbook playbook.yml
            """.trimIndent()
        }
        script {
            name = "Install dependencies and run play"
            scriptContent = """
                export no_proxy="${'$'}{NO_PROXY}"
                export HTTPS_PROXY=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                export HTTP_PROXY=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                export https_proxy=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                export http_proxy=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                
                ./launch.sh
            """.trimIndent()
        }
    }

    triggers {
        schedule {
            schedulingPolicy = weekly {
                dayOfWeek = ScheduleTrigger.DAY.Thursday
                hour = 8
            }
            triggerBuild = always()
            withPendingChangesOnly = false
            param("revisionRule", "lastFinished")
            param("branchFilter", "+:<default>")
        }
        finishBuildTrigger {
            buildTypeExtId = Workspaces_Preview_Mgmt_CbaACl0879513isLabPreviewTgw_CbaACl0879513isLabPreviewTg.extId
            successfulOnly = true
        }
        finishBuildTrigger {
            buildTypeExtId = FoundationWorkspaces_CbaANp0737259isTstPreviewMgmt.extId
            successfulOnly = true
        }
    }

    features {
        commitStatusPublisher {
            vcsRootExtId = "CbaACl0737258isTstPreviewMgmt"
            publisher = github {
                githubUrl = "https://vcs.cnsga.aws.prod.au.internal.cba/api/v3"
                authType = personalToken {
                    token = "zxx28f7e6ed05e1dfa605f9db70e8fbc5ce424edf9201769c1897fdc43a1f78943690c78d678fd12a30775d03cbe80d301b"
                }
            }
        }
    }

    requirements {
        startsWith("cloud.amazon.agent-name-prefix", "cns-ga-prod-oc-mgmt")
        contains("cloud.amazon.agent-name-prefix", "TEAMCITY-AGENT")
    }
})
