package Workspaces_Ga_Prod_CbaAPr0827916dpgPrdInetProxies.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.FinishBuildTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.FinishBuildTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.finishBuildTrigger

object Workspaces_Ga_Prod_CbaAPr0827916dpgPrdInetProxies_CbaAPr0827916dpgPrdInetProxies : BuildType({
    uuid = "50c9b67d-c731-4760-a4c4-f9e5522c5eb6"
    extId = "Workspaces_Ga_Prod_CbaAPr0827916dpgPrdInetProxies_CbaAPr0827916dpgPrdInetProxies"
    name = "cba-a-pr-0827916-dpg-prd-inet_proxies"

    params {
        param("env.branch_name", "master")
        param("env.workspace-repo-name", "cba-a-pr-0827916-dpg-prd-inet_proxies")
    }

    vcs {
        root(Workspaces_Ga_Prod_CbaAPr0827916dpgPrdInetProxies.vcsRoots.Workspaces_Ga_Prod_CbaAPr0827916dpgPrdInetProxies_WorkspaceRepoRoot)

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
                
                chmod a+x launch.sh
                ./launch.sh
            """.trimIndent()
        }
    }

    triggers {
        finishBuildTrigger {
            buildTypeExtId = "Cns_Deploy_Prod"
            successfulOnly = true
        }
    }

    requirements {
        startsWith("cloud.amazon.agent-name-prefix", "cns-ga-prod-oc-mgmt-TEAMCITY-AGENT")
    }
})
