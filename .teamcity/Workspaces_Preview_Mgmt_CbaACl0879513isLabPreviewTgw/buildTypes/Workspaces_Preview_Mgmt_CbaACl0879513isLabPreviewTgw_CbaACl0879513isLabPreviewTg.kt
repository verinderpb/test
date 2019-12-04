package Workspaces_Preview_Mgmt_CbaACl0879513isLabPreviewTgw.buildTypes

import Workspaces_Preview_Mgmt_CbaANp0726707isTstPreviewUsers.buildTypes.FoundationWorkspaces_Preview_CbaANp0726707isTstPreviewUsers
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.FinishBuildTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.FinishBuildTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.finishBuildTrigger

object Workspaces_Preview_Mgmt_CbaACl0879513isLabPreviewTgw_CbaACl0879513isLabPreviewTg : BuildType({
    uuid = "0a39f810-3abf-44fb-b40e-7d5d5a3755da"
    extId = "Workspaces_Preview_Mgmt_CbaACl0879513isLabPreviewTgw_CbaACl0879513isLabPreviewTg"
    name = "cba-a-cl-0879513-is-lab-preview_tgw"

    allowExternalStatus = true
    maxRunningBuilds = 1

    params {
        param("env.branch_name", "develop")
        param("env.workspace-repo-name", "cba-a-cl-0879513-is-lab-preview_tgw")
    }

    vcs {
        root("Workspaces_Preview_Mgmt_CbaACl0879513isLabPreviewTgw_CbaACl0879513isLabPreviewTg")

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
            buildTypeExtId = FoundationWorkspaces_Preview_CbaANp0726707isTstPreviewUsers.extId
            successfulOnly = true
        }
    }

    requirements {
        startsWith("cloud.amazon.agent-name-prefix", "cns-ga-prod-oc-mgmt-TEAMCITY-AGENT")
    }
})
