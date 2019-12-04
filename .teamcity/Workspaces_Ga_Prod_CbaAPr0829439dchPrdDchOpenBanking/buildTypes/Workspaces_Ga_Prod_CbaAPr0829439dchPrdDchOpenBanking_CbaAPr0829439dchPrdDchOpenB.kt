package Workspaces_Ga_Prod_CbaAPr0829439dchPrdDchOpenBanking.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.FinishBuildTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.FinishBuildTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.finishBuildTrigger

object Workspaces_Ga_Prod_CbaAPr0829439dchPrdDchOpenBanking_CbaAPr0829439dchPrdDchOpenB : BuildType({
    uuid = "a941cc0f-931d-42a8-9095-df7f7d8fde35"
    extId = "Workspaces_Ga_Prod_CbaAPr0829439dchPrdDchOpenBanking_CbaAPr0829439dchPrdDchOpenB"
    name = "cba-a-pr-0829439-dch-prd-dch_open_banking"

    params {
        param("env.branch_name", "master")
        param("env.workspace-repo-name", "cba-a-pr-0829439-dch-prd-dch_open_banking")
    }

    vcs {
        root(Workspaces_Ga_Prod_CbaAPr0829439dchPrdDchOpenBanking.vcsRoots.Workspaces_Ga_Prod_CbaAPr0829439dchPrdDchOpenBanking_WorkspaceRepoRoot)

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
