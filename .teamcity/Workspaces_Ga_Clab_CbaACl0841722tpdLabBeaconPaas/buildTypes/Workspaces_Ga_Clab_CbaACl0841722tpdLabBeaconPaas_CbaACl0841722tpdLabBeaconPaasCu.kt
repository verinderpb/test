package Workspaces_Ga_Clab_CbaACl0841722tpdLabBeaconPaas.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object Workspaces_Ga_Clab_CbaACl0841722tpdLabBeaconPaas_CbaACl0841722tpdLabBeaconPaasCu : BuildType({
    uuid = "4a7d2452-5589-4485-8de5-25afe5f394cf"
    extId = "Workspaces_Ga_Clab_CbaACl0841722tpdLabBeaconPaas_CbaACl0841722tpdLabBeaconPaasCu"
    name = "cba-a-cl-0841722-tpd-lab-beacon_paas_custom"


    params {
        param("env.branch_name", "master")
        param("env.custom-repo-name", "cba_a_tpd_beaconpaas_custom")
        param("env.custom-repo_branch", "develop")
        param("env.workspace-repo-name", "cba-a-cl-0841722-tpd-lab-beacon_paas")
    }

    vcs {
        root("WorkspaceRepoRoot")
        root(Workspaces_Ga_Clab_CbaACl0841722tpdLabBeaconPaas.vcsRoots.Workspaces_Ga_Clab_CbaACl0841722tpdLabBeaconPaas_CustomRepoRoot, "+:.=>custom")

        cleanCheckout = true
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
