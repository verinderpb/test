package Workspaces_Ga_Prod_CbaAPr0849704deaPrdLogitMgmt.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.FinishBuildTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.FinishBuildTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.finishBuildTrigger

object Workspaces_Ga_Prod_CbaAPr0849704deaPrdLogitMgmt_CbaAPr0849704deaPrdLogitMgmt : BuildType({
    uuid = "ac418085-b55b-4870-8468-70f307759794"
    extId = "Workspaces_Ga_Prod_CbaAPr0849704deaPrdLogitMgmt_CbaAPr0849704deaPrdLogitMgmt"
    name = "cba-a-pr-0849704-dea-prd-logit_mgmt"

    params {
        param("env.branch_name", "master")
        param("env.workspace-repo-name", "cba-a-pr-0849704-dea-prd-logit_mgmt")
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
