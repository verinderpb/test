package Workspaces_Ga_Prod_CbaAPr0737248isPrdGaTest.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Workspaces_Ga_Prod_CbaCnsAwsGaProdIsOcTestWorkspace_Wipe : BuildType({
    template(Workspaces.buildTypes.Workspaces_Wipe)
    uuid = "ae811249-f7a8-4ee3-9e3b-740de8d954c0"
    extId = "Workspaces_Ga_Prod_CbaCnsAwsGaProdIsOcTestWorkspace_Wipe"
    name = "wipe"

    params {
        param("env.workspace_name", "")
    }

    vcs {
        root("CbaAPr0737248isPrdGaTest", "+:. => ./workspace")

    }
})
