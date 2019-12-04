package Workspaces_Ga_Nonp_CbaANp0816567dwpNpdJamf

import Workspaces_Ga_Nonp_CbaANp0816567dwpNpdJamf.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "4399e1da-f803-4d02-9f13-783c6de58512"
    extId = "Workspaces_Ga_Nonp_CbaANp0816567dwpNpdJamf"
    parentId = "Workspaces_Ga_Nonp"
    name = "cba-a-np-0816567-dwp-npd-jamf"

    buildType(TenantWorkspaces_Ga_CbaANp0810066othNpdJamf)
    buildType(Workspaces_Ga_Nonp_CbaANp0816567dwpNpdJamf_CbaANp0816567dwpNpdJamfCustom)
})
