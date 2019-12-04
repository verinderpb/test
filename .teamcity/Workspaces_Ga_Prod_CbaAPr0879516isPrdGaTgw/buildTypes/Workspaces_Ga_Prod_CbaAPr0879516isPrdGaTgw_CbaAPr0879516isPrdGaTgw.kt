package Workspaces_Ga_Prod_CbaAPr0879516isPrdGaTgw.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.FinishBuildTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.FinishBuildTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.finishBuildTrigger

object Workspaces_Ga_Prod_CbaAPr0879516isPrdGaTgw_CbaAPr0879516isPrdGaTgw : BuildType({
    uuid = "6f2ecd18-c7f2-41d2-a526-609b81b2f7c8"
    extId = "Workspaces_Ga_Prod_CbaAPr0879516isPrdGaTgw_CbaAPr0879516isPrdGaTgw"
    name = "cba-a-pr-0879516-is-prd-ga_tgw"

    allowExternalStatus = true
    maxRunningBuilds = 1

    params {
        param("env.branch_name", "master")
        param("env.workspace-repo-name", "cba-a-pr-0879516-is-prd-ga_tgw")
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
            buildTypeExtId = "Cns_Deploy_Prod"
            successfulOnly = true
        }
    }

    requirements {
        startsWith("cloud.amazon.agent-name-prefix", "cns-ga-prod-oc-mgmt-TEAMCITY-AGENT")
    }
})
