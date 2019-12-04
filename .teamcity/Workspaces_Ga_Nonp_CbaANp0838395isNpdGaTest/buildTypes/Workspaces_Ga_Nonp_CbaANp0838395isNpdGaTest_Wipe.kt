package Workspaces_Ga_Nonp_CbaANp0838395isNpdGaTest.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Workspaces_Ga_Nonp_CbaANp0838395isNpdGaTest_Wipe : BuildType({
    template(Workspaces.buildTypes.Workspaces_Wipe)
    uuid = "392849af-9772-43ab-8964-01e3eefdaf58"
    extId = "Workspaces_Ga_Nonp_CbaANp0838395isNpdGaTest_Wipe"
    name = "wipe"

    params {
        param("env.workspace_name", "")
    }

    vcs {
        root("Workspaces_Ga_Nonp_CbaANp0838395isNpdGaTest_CbaANp0838395isNpdGaTest", "+:. => ./workspace")

    }
})
