package Workspaces_Preview_Test_CbaACl0838394isLabPreviewTest.buildTypes

import Workspaces_Preview_Mgmt_CbaACl0737258isTstPreviewMgmt.buildTypes.FoundationWorkspaces_CbaACl0737258isTstPreviewMgmt
import Workspaces_Preview_Test_CbaACl0838394isLabPreviewTest.buildTypes.Workspaces_Preview_Test_CbaACl0838394isLabPreviewTest_Wipe
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.FinishBuildTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.FinishBuildTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.finishBuildTrigger

object Workspaces_Preview_Test_CbaACl0838394isLabPreviewTest_CbaACl0838394isLabPrevie_2 : BuildType({
    uuid = "7abb1d50-1bf6-421a-ab05-9f60f611825d"
    extId = "Workspaces_Preview_Test_CbaACl0838394isLabPreviewTest_CbaACl0838394isLabPrevie_2"
    name = "cba-a-cl-0838394-is-lab-preview_test"

    allowExternalStatus = true
    artifactRules = "inventory.log"
    maxRunningBuilds = 1

    params {
        param("env.branch_name", "master")
        param("env.workspace-repo-name", "cba-a-cl-0838394-is-lab-preview_test")
    }

    vcs {
        root("CbaACl0838394isLabPreviewTest")

        cleanCheckout = true
    }

    steps {
        script {
            name = "Run Playbook"
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
        finishBuildTrigger {
            enabled = false
            buildTypeExtId = FoundationWorkspaces_CbaACl0737258isTstPreviewMgmt.extId
            successfulOnly = true
        }
        finishBuildTrigger {
            enabled = false
            buildTypeExtId = Workspaces_Preview_Test_CbaACl0838394isLabPreviewTest_Wipe.extId
            successfulOnly = true
        }
    }

    requirements {
        startsWith("cloud.amazon.agent-name-prefix", "cns-ga-prod-oc-mgmt-TEAMCITY-AGENT")
    }
})
