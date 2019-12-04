package Workspaces_Ga_Prod_CbaAPr0849704deaPrdLogitMgmt.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object Workspaces_Ga_Prod_CbaAPr0849704deaPrdLogitMgmt_CbaAPr0849704deaPrdLogitMgmtCust : BuildType({
    uuid = "6cab9469-bb1d-497c-a945-4b8f0b25e7c8"
    extId = "Workspaces_Ga_Prod_CbaAPr0849704deaPrdLogitMgmt_CbaAPr0849704deaPrdLogitMgmtCust"
    name = "cba-a-pr-0849704-dea-prd-logit_mgmt_custom"

    params {
        param("env.branch_name", "master")
        param("env.custom-repo-name", "cba-a-dea-logit-custom")
        param("env.custom-repo_branch", "prod")
        param("env.workspace-repo-name", "cba-a-pr-0849704-dea-prd-logit_mgmt")
    }

    vcs {
        root("WorkspaceRepoRoot")
        root("CustomRepoRoot", "+:.=>custom")

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
                
                ./launch.sh custom
            """.trimIndent()
        }
    }

    triggers {
        vcs {
            triggerRules = "+:root=CustomRepoRoot:**"
            branchFilter = "+:<default>"
            enableQueueOptimization = false
        }
    }

    requirements {
        startsWith("cloud.amazon.agent-name-prefix", "cns-ga-prod-oc-mgmt-TEAMCITY-AGENT")
    }
})
