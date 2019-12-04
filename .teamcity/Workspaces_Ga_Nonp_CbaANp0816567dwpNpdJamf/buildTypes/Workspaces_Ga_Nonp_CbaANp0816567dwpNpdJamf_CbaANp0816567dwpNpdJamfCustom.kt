package Workspaces_Ga_Nonp_CbaANp0816567dwpNpdJamf.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object Workspaces_Ga_Nonp_CbaANp0816567dwpNpdJamf_CbaANp0816567dwpNpdJamfCustom : BuildType({
    uuid = "d3aab61d-f997-43c4-a34e-4cfdd8c064e3"
    extId = "Workspaces_Ga_Nonp_CbaANp0816567dwpNpdJamf_CbaANp0816567dwpNpdJamfCustom"
    name = "cba-a-np-0816567-dwp-npd-jamf_custom"


    params {
        param("env.branch_name", "master")
        param("env.custom-repo-name", "cba-a-dwp-jamf_custom")
        param("env.custom-repo_branch", "develop")
        param("env.workspace-repo-name", "cba-a-np-0816567-dwp-npd-jamf")
    }

    vcs {
        root("WorkspaceRepoRoot")
        root("CustomRepoRoot", "+:.=>custom")

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
            triggerRules = "+:root=CustomRepoRoot:**"
            branchFilter = "+:<default>"
            enableQueueOptimization = false
        }
    }

    requirements {
        startsWith("cloud.amazon.agent-name-prefix", "cns-ga-prod-oc-mgmt-TEAMCITY-AGENT")
    }
})
