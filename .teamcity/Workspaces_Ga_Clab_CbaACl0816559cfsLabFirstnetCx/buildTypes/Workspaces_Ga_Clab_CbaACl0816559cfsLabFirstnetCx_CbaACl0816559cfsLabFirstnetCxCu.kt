package Workspaces_Ga_Clab_CbaACl0816559cfsLabFirstnetCx.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object Workspaces_Ga_Clab_CbaACl0816559cfsLabFirstnetCx_CbaACl0816559cfsLabFirstnetCxCu : BuildType({
    uuid = "741bb33f-7450-4ea8-90f5-1e3e64cfb692"
    extId = "Workspaces_Ga_Clab_CbaACl0816559cfsLabFirstnetCx_CbaACl0816559cfsLabFirstnetCxCu"
    name = "cba-a-cl-0816559-cfs-lab-firstnet_cx_custom"

    params {
        param("env.branch_name", "master")
        param("env.custom-repo-name", "cba-a-cfs-lab-firstnet_cx_custom")
        param("env.workspace-repo-name", "cba-a-cl-0816559-cfs-lab-firstnet_cx")
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
