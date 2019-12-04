package Workspaces_Ga_Nonp_CbaANp0738860dpgDevFlare

import Workspaces_Ga_Nonp_CbaANp0738860dpgDevFlare.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "a4e1cc97-bf51-405d-98c5-e74b4bb2224d"
    extId = "Workspaces_Ga_Nonp_CbaANp0738860dpgDevFlare"
    parentId = "Workspaces_Ga_Nonp"
    name = "cba-a-np-0738860-dpg-dev-flare"

    buildType(TenantWorkspaces_Ga_CbaANp0738860dpgDevFlare)
})
