package Workspaces_Ga_Prod_CbaAPr0885564isPrdTgwGaTest.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Workspaces_Ga_Prod_CbaAPr0885564isPrdTgwGaTest_Wipe : BuildType({
    template(Workspaces.buildTypes.Workspaces_Wipe)
    uuid = "ed054df9-a231-417b-a42d-18b3f925bbe2"
    extId = "Workspaces_Ga_Prod_CbaAPr0885564isPrdTgwGaTest_Wipe"
    name = "wipe"

    params {
        param("env.workspace_name", "")
    }

    vcs {
        root("Workspaces_Ga_Prod_CbaAPr0885564isPrdTgwGaTest_CbaAPr0885564isPrdTgwGaTest", "+:. => ./workspace")

    }
})
