package Workspaces_Ga_Clab_CbaACl0904703othLabFwdDplyedEn.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object Workspaces_Ga_Clab_CbaACl0904703othLabFwdDplyedEn_CbaACl0904703othLabFwdDplyed_2 : BuildType({
    uuid = "0a21fdce-5d19-4024-9586-02b436de0e58"
    extId = "Workspaces_Ga_Clab_CbaACl0904703othLabFwdDplyedEn_CbaACl0904703othLabFwdDplyed_2"
    name = "cba-a-cl-0904703-oth-lab-fwd_dplyed_en_custom"

    params {
        param("env.branch_name", "master")
        param("env.custom-repo-name", "cba-a-fwd-dplyed-en_custom")
        param("env.custom-repo_branch", "develop")
        param("env.workspace-repo-name", "cba-a-cl-0904703-oth-lab-fwd_dplyed_en")
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
