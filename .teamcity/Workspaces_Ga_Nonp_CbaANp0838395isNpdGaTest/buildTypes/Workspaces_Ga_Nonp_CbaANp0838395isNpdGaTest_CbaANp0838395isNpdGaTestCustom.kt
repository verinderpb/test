package Workspaces_Ga_Nonp_CbaANp0838395isNpdGaTest.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object Workspaces_Ga_Nonp_CbaANp0838395isNpdGaTest_CbaANp0838395isNpdGaTestCustom : BuildType({
    uuid = "769aa08b-06ab-4d4d-8d2c-d8f59c98fcb9"
    extId = "Workspaces_Ga_Nonp_CbaANp0838395isNpdGaTest_CbaANp0838395isNpdGaTestCustom"
    name = "cba-a-np-0838395-is-npd-ga_test_custom"

    params {
        param("env.branch_name", "master")
        param("env.custom-repo-name", "blank_workspace_custom")
        param("env.custom-repo_branch", "develop")
        param("env.workspace-repo-name", "cba-a-np-0838395-is-npd-ga_test")
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
