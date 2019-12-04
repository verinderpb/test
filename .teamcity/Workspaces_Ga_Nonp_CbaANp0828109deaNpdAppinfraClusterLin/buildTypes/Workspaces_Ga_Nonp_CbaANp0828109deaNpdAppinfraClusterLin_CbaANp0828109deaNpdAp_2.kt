package Workspaces_Ga_Nonp_CbaANp0828109deaNpdAppinfraClusterLin.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object Workspaces_Ga_Nonp_CbaANp0828109deaNpdAppinfraClusterLin_CbaANp0828109deaNpdAp_2 : BuildType({
    uuid = "d8c266da-286c-464a-b77f-db1e07ab3abf"
    extId = "Workspaces_Ga_Nonp_CbaANp0828109deaNpdAppinfraClusterLin_CbaANp0828109deaNpdAp_2"
    name = "cba-a-np-0828109-dea-npd-appinfra_cluster_lin_custom"

    params {
        param("env.branch_name", "master")
        param("env.custom-repo-name", "cba-a-dea-appinfra-linux_custom")
        param("env.custom-repo_branch", "master")
        param("env.workspace-repo-name", "cba-a-np-0828109-dea-npd-appinfra_cluster_lin")
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
