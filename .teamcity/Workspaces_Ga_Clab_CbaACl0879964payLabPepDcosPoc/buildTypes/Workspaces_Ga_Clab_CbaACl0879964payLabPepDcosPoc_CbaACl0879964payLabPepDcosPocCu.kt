package Workspaces_Ga_Clab_CbaACl0879964payLabPepDcosPoc.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object Workspaces_Ga_Clab_CbaACl0879964payLabPepDcosPoc_CbaACl0879964payLabPepDcosPocCu : BuildType({
    uuid = "644b75f8-e23d-4e6f-b1f7-32507dc76989"
    extId = "Workspaces_Ga_Clab_CbaACl0879964payLabPepDcosPoc_CbaACl0879964payLabPepDcosPocCu"
    name = "cba-a-cl-0879964-pay-lab-pep_dcos_poc_custom"

    params {
        param("env.branch_name", "master")
        param("env.custom-repo-name", "cba-a-pay-pep-custom")
        param("env.custom-repo_branch", "develop")
        param("env.workspace-repo-name", "cba-a-cl-0879964-pay-lab-pep_dcos_poc")
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
