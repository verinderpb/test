package Workspaces_Ga_Prod_CbaAPr0827916dpgPrdInetProxies.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object Workspaces_Ga_Prod_CbaAPr0827916dpgPrdInetProxies_CbaAPr0827916dpgPrdInetProxi_2 : BuildType({
    uuid = "f27e87b5-7447-40ea-b9d8-417160a86208"
    extId = "Workspaces_Ga_Prod_CbaAPr0827916dpgPrdInetProxies_CbaAPr0827916dpgPrdInetProxi_2"
    name = "cba-a-pr-0827916-dpg-prd-inet_proxies_custom"

    params {
        param("env.branch_name", "master")
        param("env.custom-repo-name", "cba-a-dpg-inetproxies-custom")
        param("env.custom-repo_branch", "master")
        param("env.workspace-repo-name", "cba-a-pr-0827916-dpg-prd-inet_proxies")
    }

    vcs {
        root(Workspaces_Ga_Prod_CbaAPr0827916dpgPrdInetProxies.vcsRoots.Workspaces_Ga_Prod_CbaAPr0827916dpgPrdInetProxies_WorkspaceRepoRoot)
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
