package Workspaces_Ga_Nonp_CbaANp0737252isTstGaTest.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Workspaces_Ga_Nonp_CbaCnsAwsGaNonpIsOcTestWorkspace_Wipe : BuildType({
    template(Workspaces.buildTypes.Workspaces_Wipe)
    uuid = "e0551b0e-407a-4f1b-8b71-2978246bfb38"
    extId = "Workspaces_Ga_Nonp_CbaCnsAwsGaNonpIsOcTestWorkspace_Wipe"
    name = "wipe"

    params {
        param("env.workspace_name", "")
    }

    vcs {
        root("Workspaces_Ga_Nonp_CbaANp0737252isTstGaTest_CbaANp0737252isTstGaTest", "+:. => ./workspace")

    }
})
