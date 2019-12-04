package Workspaces_Ga_Clab_CbaACl0737250isTstGaTest.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Workspaces_Ga_Clab_CbaCnsAwsGaClabIsOcTestWorkspace_Wipe : BuildType({
    template(Workspaces.buildTypes.Workspaces_Wipe)
    uuid = "2d6988cc-441d-41c9-95ec-7c6e84641903"
    extId = "Workspaces_Ga_Clab_CbaCnsAwsGaClabIsOcTestWorkspace_Wipe"
    name = "wipe"

    artifactRules = """
        inventory.log
        undeploy_account.log
        disassociate_policy_from_roles.log
    """.trimIndent()

    params {
        param("env.workspace_name", "cba-a-cl-0737250-is-tst-ga_test")
    }

    vcs {
        root("CbaCnsAwsGaClabIsOcTestWorkspace", "+:. => ./workspace")

    }
})
