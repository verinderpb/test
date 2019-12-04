package Workspaces_Ga_Nonp_CbaANp0829938tpdNpdMurexGrids.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.BuildFeature
import jetbrains.buildServer.configs.kotlin.v10.BuildFeature.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object Workspaces_Ga_Nonp_CbaANp0829938tpdNpdMurexGrids_CbaANp0829938tpdNpdMurexGridsCu : BuildType({
    uuid = "8795a4a0-7458-47bc-918a-95d054e88304"
    extId = "Workspaces_Ga_Nonp_CbaANp0829938tpdNpdMurexGrids_CbaANp0829938tpdNpdMurexGridsCu"
    name = "cba-a-np-0829938-tpd-dev-murex_custom"

    params {
        param("env.branch_name", "master")
        param("env.custom-repo-name", "cba-a-tpd-murex-custom")
        param("env.custom-repo_branch", "develop")
        param("env.workspace-repo-name", "cba-a-np-0829938-tpd-dev-murex")
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

    features {
        feature {
            type = "teamcity.github.status"
            param("guthub_owner", "mallapkr")
            param("guthub_authentication_type", "token")
            param("guthub_repo", "cba-a-tpd-murex-custom")
            param("guthub_host", "https://vcs.cnsga.aws.prod.au.internal.cba/api/v3")
            param("github_report_on", "on start and finish")
            param("secure:github_access_token", "zxx8abdf08ef95faf8038c7df47d41876c06ca35653e9205326d037c9b001fca73ffa1f90224a931a0b775d03cbe80d301b")
        }
    }

    requirements {
        startsWith("cloud.amazon.agent-name-prefix", "cns-ga-prod-oc-mgmt-TEAMCITY-AGENT")
    }
})
