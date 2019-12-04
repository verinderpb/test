package Workspaces_Ga_Prod_CbaAPr0869482tpdStgMurex.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.FinishBuildTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.FinishBuildTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.finishBuildTrigger

object Workspaces_Ga_Prod_CbaAPr0869482tpdStgMurex_CbaAPr0869482tpdStgMurex : BuildType({
    uuid = "393b5ddd-bf08-4a4a-8631-ae3be24703fe"
    extId = "Workspaces_Ga_Prod_CbaAPr0869482tpdStgMurex_CbaAPr0869482tpdStgMurex"
    name = "cba-a-pr-0869482-tpd-stg-murex"

    params {
        param("env.branch_name", "master")
        param("env.workspace-repo-name", "cba-a-pr-0869482-tpd-stg-murex")
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
            buildTypeExtId = "Cns_Deploy_Prod"
            successfulOnly = true
        }
    }

    requirements {
        startsWith("cloud.amazon.agent-name-prefix", "cns-ga-prod-oc-mgmt-TEAMCITY-AGENT")
    }
})
