package Workspaces_Ga_Clab_CbaACl0838393isLabGaTest.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Workspaces_Ga_Clab_CbaACl0838393isLabGaTest_Wipe : BuildType({
    template(Workspaces.buildTypes.Workspaces_Wipe)
    uuid = "8aae9dcd-ed52-4d66-ad1c-3fb1e50f4bf7"
    extId = "Workspaces_Ga_Clab_CbaACl0838393isLabGaTest_Wipe"
    name = "wipe"

    params {
        param("env.workspace_name", "")
    }

    vcs {
        root("Workspaces_Ga_Clab_CbaACl0838393isLabGaTest_CbaACl0838393isLabGaTest", "+:. => ./workspace")

    }
})
