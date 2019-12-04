package Workspaces_Ga_Prod_CbaAPr0848875tpdPrdMurex.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object Workspaces_Ga_Prod_CbaAPr0848875tpdPrdMurex_CbaAPr0848875tpdPrdMurexCustom : BuildType({
    uuid = "fb879f61-adf6-4196-ad26-b6d8af2547b6"
    extId = "Workspaces_Ga_Prod_CbaAPr0848875tpdPrdMurex_CbaAPr0848875tpdPrdMurexCustom"
    name = "cba-a-pr-0848875-tpd-prd-murex_custom"

    params {
        param("env.branch_name", "master")
        param("env.custom-repo-name", "cba-a-tpd-murex-custom")
        param("env.custom-repo_branch", "prod")
        param("env.workspace-repo-name", "cba-a-pr-0848875-tpd-prd-murex")
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
