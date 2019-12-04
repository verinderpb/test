package Workspaces_Ga_Prod_CbaANp0738862dpgTstFlare

import Workspaces_Ga_Prod_CbaANp0738862dpgTstFlare.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "6b905f69-e09b-4437-add0-9a58e8a9d8e3"
    extId = "Workspaces_Ga_Prod_CbaANp0738862dpgTstFlare"
    parentId = "Workspaces_Ga_Nonp"
    name = "cba-a-np-0738862-dpg-tst-flare"

    buildType(TenantWorkspaces_Ga_CbaANp0738862dpgTstFlare)
    buildTypesOrder = arrayListOf(Workspaces_Ga_Prod_CbaANp0738862dpgTstFlare.buildTypes.TenantWorkspaces_Ga_CbaANp0738862dpgTstFlare)
})
