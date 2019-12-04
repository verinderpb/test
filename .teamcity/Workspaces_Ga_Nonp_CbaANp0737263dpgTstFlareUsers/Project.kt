package Workspaces_Ga_Nonp_CbaANp0737263dpgTstFlareUsers

import Workspaces_Ga_Nonp_CbaANp0737263dpgTstFlareUsers.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "a2e579f2-e217-46a3-9013-14645826a16b"
    extId = "Workspaces_Ga_Nonp_CbaANp0737263dpgTstFlareUsers"
    parentId = "Workspaces_Ga_Nonp"
    name = "cba-a-np-0737263-dpg-tst-flare_users"

    buildType(TenantWorkspaces_Ga_CbaANp0737263dpgTstFlareUsers)
})
