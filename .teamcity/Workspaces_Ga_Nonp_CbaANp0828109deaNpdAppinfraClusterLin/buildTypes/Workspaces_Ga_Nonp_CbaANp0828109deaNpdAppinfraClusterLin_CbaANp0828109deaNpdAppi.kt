package Workspaces_Ga_Nonp_CbaANp0828109deaNpdAppinfraClusterLin.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.FinishBuildTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.FinishBuildTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.finishBuildTrigger

object Workspaces_Ga_Nonp_CbaANp0828109deaNpdAppinfraClusterLin_CbaANp0828109deaNpdAppi : BuildType({
    uuid = "5a25e211-08e8-4783-8bad-e4e26a1a8d85"
    extId = "Workspaces_Ga_Nonp_CbaANp0828109deaNpdAppinfraClusterLin_CbaANp0828109deaNpdAppi"
    name = "cba-a-np-0828109-dea-npd-appinfra_cluster_lin"
    description = "test"

    maxRunningBuilds = 1

    params {
        param("custom.cns.repo.branch.specification", "")
        param("custom.cns.repo.default.branch", "master")
        param("custom.cns.repo.name", "cba-cns-aws-ga-nonp-is-oc-test-workspace")
        param("env.branch_name", "master")
        param("env.workspace-repo-name", "cba-a-np-0828109-dea-npd-appinfra_cluster_lin")
    }

    vcs {
        root("WorkspaceRepoRoot")

        cleanCheckout = true
    }

    steps {
        script {
            name = "test"
            scriptContent = """
                export no_proxy="${'$'}{NO_PROXY}"
                export HTTPS_PROXY=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                export HTTP_PROXY=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                export https_proxy=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                export http_proxy=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                
                ./launch.sh
            """.trimIndent()
        }
        script {
            name = "Run Playbook"
            enabled = false
            scriptContent = """
                export no_proxy="${'$'}{NO_PROXY}"
                export HTTPS_PROXY=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                export HTTP_PROXY=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                export https_proxy=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                export http_proxy=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                
                #./update_versions.py
                #cat requirements.yml
                echo ${'$'}{BranchName}
                
                ls -ltr
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
