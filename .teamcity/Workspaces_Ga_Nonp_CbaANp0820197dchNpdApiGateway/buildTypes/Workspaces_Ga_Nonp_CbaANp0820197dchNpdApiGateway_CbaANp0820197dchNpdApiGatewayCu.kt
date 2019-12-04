package Workspaces_Ga_Nonp_CbaANp0820197dchNpdApiGateway.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object Workspaces_Ga_Nonp_CbaANp0820197dchNpdApiGateway_CbaANp0820197dchNpdApiGatewayCu : BuildType({
    uuid = "5301040e-d25b-4aed-bdd8-e322dcf9ab80"
    extId = "Workspaces_Ga_Nonp_CbaANp0820197dchNpdApiGateway_CbaANp0820197dchNpdApiGatewayCu"
    name = "cba-a-np-0820197-dch-npd-api_gateway_custom"


    params {
        param("env.branch_name", "develop")
        param("env.custom-repo-name", "cba-a-dch-openbanking_custom")
        param("env.workspace-repo-name", "cba-a-np-0820197-dch-npd-api_gateway")
    }

    vcs {
        root(Workspaces_Ga_Nonp_CbaANp0820197dchNpdApiGateway.vcsRoots.Workspaces_Ga_Nonp_CbaANp0820197dchNpdApiGateway_WorkspaceRepoRoot)
        root(Workspaces_Ga_Nonp_CbaANp0820197dchNpdApiGateway.vcsRoots.Workspaces_Ga_Nonp_CbaANp0820197dchNpdApiGateway_CustomRepoRoot_2, "+:.=>custom")

        checkoutMode = CheckoutMode.ON_AGENT
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
            triggerRules = "+:root=Workspaces_Ga_Nonp_CbaANp0820197dchNpdApiGateway_CustomRepoRoot_2:**"
            branchFilter = "+:<default>"
            enableQueueOptimization = false
        }
    }

    requirements {
        startsWith("cloud.amazon.agent-name-prefix", "cns-ga-prod-oc-mgmt-TEAMCITY-AGENT")
    }
})
