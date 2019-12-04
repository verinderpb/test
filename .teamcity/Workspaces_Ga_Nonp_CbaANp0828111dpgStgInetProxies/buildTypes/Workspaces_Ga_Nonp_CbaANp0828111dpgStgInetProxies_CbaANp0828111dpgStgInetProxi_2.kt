package Workspaces_Ga_Nonp_CbaANp0828111dpgStgInetProxies.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object Workspaces_Ga_Nonp_CbaANp0828111dpgStgInetProxies_CbaANp0828111dpgStgInetProxi_2 : BuildType({
    uuid = "af1a12f7-4c3e-4128-a9f3-7a942c0a8b18"
    extId = "Workspaces_Ga_Nonp_CbaANp0828111dpgStgInetProxies_CbaANp0828111dpgStgInetProxi_2"
    name = "cba-a-np-0828111-dpg-stg-inet_proxies_custom"

    params {
        param("env.branch_name", "develop")
        param("env.custom-repo-name", "cba-a-dpg-inetproxies-custom")
        param("env.workspace-repo-name", "cba-a-np-0828111-dpg-stg-inet_proxies")
    }

    vcs {
        root(Workspaces_Ga_Nonp_CbaANp0828111dpgStgInetProxies.vcsRoots.Workspaces_Ga_Nonp_CbaANp0828111dpgStgInetProxies_WorkspaceRepoRoot)
        root(Workspaces_Ga_Nonp_CbaANp0828111dpgStgInetProxies.vcsRoots.Workspaces_Ga_Nonp_CbaANp0828111dpgStgInetProxies_CustomRepoRoot, "+:.=>custom")

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
            triggerRules = "+:root=Workspaces_Ga_Nonp_CbaANp0828111dpgStgInetProxies_CustomRepoRoot:**"
            branchFilter = "+:<default>"
            enableQueueOptimization = false
        }
    }

    requirements {
        startsWith("cloud.amazon.agent-name-prefix", "cns-ga-prod-oc-mgmt-TEAMCITY-AGENT")
    }
})
