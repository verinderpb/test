package Workspaces_Ga_Prod_CbaAPr0908591tpdPrdBeaconPaas.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object Workspaces_Ga_Prod_CbaAPr0908591tpdPrdBeaconPaas_CbaAPr0908591tpdPrdBeaconPaasCu : BuildType({
    uuid = "8efdebcd-01eb-4614-b6f7-03378f0b69d5"
    extId = "Workspaces_Ga_Prod_CbaAPr0908591tpdPrdBeaconPaas_CbaAPr0908591tpdPrdBeaconPaasCu"
    name = "cba-a-pr-0908591-tpd-prd-beacon_paas_custom"

    params {
        param("env.branch_name", "master")
        param("env.custom-repo-name", "cba_a_tpd_beaconpaas_custom")
        param("env.custom-repo_branch", "master")
        param("env.workspace-repo-name", "cba-a-pr-0908591-tpd-prd-beacon_paas")
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
