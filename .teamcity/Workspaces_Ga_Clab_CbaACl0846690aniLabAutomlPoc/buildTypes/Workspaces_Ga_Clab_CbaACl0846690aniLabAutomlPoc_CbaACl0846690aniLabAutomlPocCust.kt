package Workspaces_Ga_Clab_CbaACl0846690aniLabAutomlPoc.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object Workspaces_Ga_Clab_CbaACl0846690aniLabAutomlPoc_CbaACl0846690aniLabAutomlPocCust : BuildType({
    uuid = "8963ad88-265c-4ed9-ad37-3bc098c7250b"
    extId = "Workspaces_Ga_Clab_CbaACl0846690aniLabAutomlPoc_CbaACl0846690aniLabAutomlPocCust"
    name = "cba-a-cl-0846690-ani-lab-automl_poc_custom"

    params {
        param("env.branch_name", "master")
        param("env.custom-repo-name", "cba-a-ani-automl-custom")
        param("env.custom-repo_branch", "develop")
        param("env.workspace-repo-name", "cba-a-cl-0846690-ani-lab-automl_poc")
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
