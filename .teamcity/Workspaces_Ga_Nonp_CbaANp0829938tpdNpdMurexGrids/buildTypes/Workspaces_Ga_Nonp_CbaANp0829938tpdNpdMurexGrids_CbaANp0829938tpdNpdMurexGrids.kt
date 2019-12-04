package Workspaces_Ga_Nonp_CbaANp0829938tpdNpdMurexGrids.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.FinishBuildTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.FinishBuildTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.finishBuildTrigger

object Workspaces_Ga_Nonp_CbaANp0829938tpdNpdMurexGrids_CbaANp0829938tpdNpdMurexGrids : BuildType({
    uuid = "4ed1c578-acbe-400a-8453-099a8ed3e50f"
    extId = "Workspaces_Ga_Nonp_CbaANp0829938tpdNpdMurexGrids_CbaANp0829938tpdNpdMurexGrids"
    name = "cba-a-np-0829938-tpd-dev-murex"

    params {
        param("env.branch_name", "master")
        param("env.workspace-repo-name", "cba-a-np-0829938-tpd-dev-murex")
    }

    vcs {
        root(Workspaces_Ga_Nonp_CbaANp0829938tpdNpdMurexGrids.vcsRoots.Workspaces_Ga_Nonp_CbaANp0829938tpdNpdMurexGrids_WorkspaceRepoRoot)

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
                
                ./launch.sh
            """.trimIndent()
        }
    }

    triggers {
        finishBuildTrigger {
            buildTypeExtId = "Cns_Deploy_Nonp"
            successfulOnly = true
        }
    }

    requirements {
        startsWith("cloud.amazon.agent-name-prefix", "cns-ga-prod-oc-mgmt-TEAMCITY-AGENT")
    }
})
