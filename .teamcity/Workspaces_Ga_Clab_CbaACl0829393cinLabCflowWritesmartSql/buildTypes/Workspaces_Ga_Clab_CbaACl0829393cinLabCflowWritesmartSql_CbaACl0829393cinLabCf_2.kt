package Workspaces_Ga_Clab_CbaACl0829393cinLabCflowWritesmartSql.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object Workspaces_Ga_Clab_CbaACl0829393cinLabCflowWritesmartSql_CbaACl0829393cinLabCf_2 : BuildType({
    uuid = "db32e35e-d2ea-483c-b8eb-4f2e1dc148e2"
    extId = "Workspaces_Ga_Clab_CbaACl0829393cinLabCflowWritesmartSql_CbaACl0829393cinLabCf_2"
    name = "cba-a-cl-0829393-cin-lab-cflow_writesmart_sql_custom"

    params {
        param("env.branch_name", "master")
        param("env.custom-repo-name", "cba-a-cin-writesmart_sql")
        param("env.custom-repo_branch", "develop")
        param("env.workspace-repo-name", "cba-a-cl-0829393-cin-lab-cflow_writesmart_sql")
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
