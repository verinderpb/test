package Workspaces_Ga_Prod_CbaAPr0821500deaPrdAppinfraMgmt.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object Workspaces_Ga_Prod_CbaAPr0821500deaPrdAppinfraMgmt_CbaAPr0821500deaPrdAppinfraMg : BuildType({
    uuid = "0962f4e5-fd9f-42b0-86b1-ddded3fccb61"
    extId = "Workspaces_Ga_Prod_CbaAPr0821500deaPrdAppinfraMgmt_CbaAPr0821500deaPrdAppinfraMg"
    name = "cba-a-pr-0821500-dea-prd-appinfra_mgmt_custom"

    params {
        param("env.branch_name", "master")
        param("env.custom-repo-name", "cba-a-dea-appinfra-mgmt_custom")
        param("env.custom-repo_branch", "prod")
        param("env.workspace-repo-name", "cba-a-pr-0821500-dea-prd-appinfra_mgmt")
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
