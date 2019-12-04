package Workspaces_Ga_Prod_CbaAPr0829439dchPrdDchOpenBanking.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object Workspaces_Ga_Prod_CbaAPr0829439dchPrdDchOpenBanking_CbaAPr0829439dchPrdDchOpe_2 : BuildType({
    uuid = "46aa4018-ca09-4768-878a-2a5712bf6023"
    extId = "Workspaces_Ga_Prod_CbaAPr0829439dchPrdDchOpenBanking_CbaAPr0829439dchPrdDchOpe_2"
    name = "cba-a-pr-0829439-dch-prd-dch_open_banking_custom"

    params {
        param("env.branch_name", "master")
        param("env.custom-repo-name", "cba-a-dch-openbanking_custom")
        param("env.custom-repo_branch", "prod")
        param("env.workspace-repo-name", "cba-a-pr-0829439-dch-prd-dch_open_banking")
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
