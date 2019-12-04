package Workspaces_Canary_CbaACl0879512isLabCanaryTgw.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.FinishBuildTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.FinishBuildTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.finishBuildTrigger

object Workspaces_Canary_CbaACl0879512isLabCanaryTgw_CbaACl0879512isLabCanaryTgw : BuildType({
    uuid = "84714596-6f95-4cf6-99c6-2163e27ab6e5"
    extId = "Workspaces_Canary_CbaACl0879512isLabCanaryTgw_CbaACl0879512isLabCanaryTgw"
    name = "cba-a-cl-0879512-is-lab-canary_tgw"

    allowExternalStatus = true

    params {
        param("env.branch_name", "develop")
        param("env.workspace-repo-name", "cba-a-cl-0879512-is-lab-canary_tgw")
    }

    vcs {
        root(Workspaces_Canary.vcsRoots.Vcs_Workspaces_Canary_CbaACl0879512isLabCanaryTgw_CbaACl0879512isLabCanaryTgw)

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
