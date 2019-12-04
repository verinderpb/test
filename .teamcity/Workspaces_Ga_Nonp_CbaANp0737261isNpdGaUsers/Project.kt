package Workspaces_Ga_Nonp_CbaANp0737261isNpdGaUsers

import Workspaces_Ga_Nonp_CbaANp0737261isNpdGaUsers.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "4aff2420-0b5b-4ec9-9dfc-10881584dd3f"
    extId = "Workspaces_Ga_Nonp_CbaANp0737261isNpdGaUsers"
    parentId = "Workspaces_Ga_Nonp"
    name = "cba-a-np-0737261-is-npd-ga_users"

    buildType(FoundationWorkspaces_Ga_CbaANp0737261isNpdGaUsers)
})
