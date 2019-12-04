package Workspaces_Ga_Clab_CbaACl0879511isLabGaTgw.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.FinishBuildTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.FinishBuildTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.finishBuildTrigger

object Workspaces_Ga_Clab_CbaACl0879511isLabGaTgw_CbaACl0879511isLabGaTgw : BuildType({
    uuid = "28dd479e-6bcc-4669-b7ca-3133603c5ccf"
    extId = "Workspaces_Ga_Clab_CbaACl0879511isLabGaTgw_CbaACl0879511isLabGaTgw"
    name = "cba-a-cl-0879511-is-lab-ga_tgw"

    allowExternalStatus = true

    params {
        param("env.branch_name", "master")
        param("env.workspace-repo-name", "cba-a-cl-0879511-is-lab-ga_tgw")
    }

    vcs {
        root("WorkspaceRepoRoot")

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
