package Workspaces_Preview_Test_CbaANp0838392isSitPreviewTest.buildTypes

import Workspaces_Preview_Mgmt_CbaANp0737259isTstPreviewMgmt.buildTypes.FoundationWorkspaces_CbaANp0737259isTstPreviewMgmt
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.FinishBuildTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.FinishBuildTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.finishBuildTrigger

object Workspaces_Preview_Test_CbaANp0838392isSitPreviewTest_CbaANp0838392isSitPrevie_2 : BuildType({
    uuid = "bb946634-1fa8-46a2-84d9-9398d19d1870"
    extId = "Workspaces_Preview_Test_CbaANp0838392isSitPreviewTest_CbaANp0838392isSitPrevie_2"
    name = "cba-a-np-0838392-is-sit-preview_test"

    allowExternalStatus = true
    maxRunningBuilds = 1

    vcs {
        root(Workspaces_Preview_Test_CbaANp0838392isSitPreviewTest.vcsRoots.Workspaces_Preview_Test_CbaANp0838392isSitPreviewTest_CbaANp0838392isSitPreviewT)

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
            buildTypeExtId = "Workspaces_Preview_Test_CbaANp0838392isSitPreviewTest_Clean"
            successfulOnly = true
        }
        finishBuildTrigger {
            enabled = false
            buildTypeExtId = FoundationWorkspaces_CbaANp0737259isTstPreviewMgmt.extId
            successfulOnly = true
        }
    }

    requirements {
        startsWith("cloud.amazon.agent-name-prefix", "cns-ga-prod-oc-mgmt-TEAMCITY-AGENT")
    }
})
