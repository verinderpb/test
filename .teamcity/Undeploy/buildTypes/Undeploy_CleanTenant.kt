package Undeploy.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ExecBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ExecBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.exec
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object Undeploy_CleanTenant : BuildType({
    uuid = "82bf7e98-d809-4691-94bb-1ae6e453eb97"
    extId = "Undeploy_CleanTenant"
    name = "Clean Tenant"
    description = "Undeploy a tenant account"

    artifactRules = "./inventory.log"

    params {
        param("default_workspace_branch", "develop")
        param("env.workspace_repo_name", "%workspace_repo_name%")
        param("workspace_branch_name", "develop")
        text("workspace_repo_name", "cba-a-cl-0783784-is-lab-canary_demo3", display = ParameterDisplay.PROMPT, allowEmpty = false)
    }

    vcs {
        root("HttpsVcsCnsgaAwsProdAuInternalCbaCnsAnsibleAwsAccountWipeOutGit")
        root("WorkspaceRepo", "+:. => ./workspace")

        cleanCheckout = true
    }

    steps {
        exec {
            name = "Install dependencies and run play"
            path = "launch.sh"
        }
        script {
            name = "Install dependencies and run play (workspace_name != repo_name)"
            enabled = false
            scriptContent = """
                ansible-galaxy install -c -f -p workspace/roles -r workspace/requirements.yml
                mv workspace/host_vars/cba-a-np-0838395-is-npd-ga_test.yml workspace/host_vars/cba-a-np-0838394-is-npd-ga_test.yml
                ansible-playbook -i workspace/roles/ansible-workspace-config/inventory playbook.yml -e wipe_hosts='cba-a-np-0838394-is-npd-ga_test'
            """.trimIndent()
        }
    }

    requirements {
        startsWith("cloud.amazon.agent-name-prefix", "cns-ga-prod-oc-mgmt-TEAMCITY-AGENT")
    }
})
