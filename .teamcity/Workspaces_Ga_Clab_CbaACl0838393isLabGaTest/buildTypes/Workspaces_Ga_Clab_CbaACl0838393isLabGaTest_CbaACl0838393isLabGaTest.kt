package Workspaces_Ga_Clab_CbaACl0838393isLabGaTest.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.FinishBuildTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.FinishBuildTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.finishBuildTrigger

object Workspaces_Ga_Clab_CbaACl0838393isLabGaTest_CbaACl0838393isLabGaTest : BuildType({
    uuid = "febfb577-3ac3-40f9-8e03-2ec6882eed89"
    extId = "Workspaces_Ga_Clab_CbaACl0838393isLabGaTest_CbaACl0838393isLabGaTest"
    name = "cba-a-cl-0838393-is-lab-ga_test"

    allowExternalStatus = true
    maxRunningBuilds = 1

    params {
        param("env.branch_name", "master")
        param("env.workspace-repo-name", "cba-a-cl-0838393-is-lab-ga_test")
    }

    vcs {
        root("WorkspaceRepoRoot")

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
            buildTypeExtId = "Cns_Deploy_Clab"
            successfulOnly = true
        }
    }

    requirements {
        startsWith("cloud.amazon.agent-name-prefix", "cns-ga-prod-oc-mgmt-TEAMCITY-AGENT")
    }
})
