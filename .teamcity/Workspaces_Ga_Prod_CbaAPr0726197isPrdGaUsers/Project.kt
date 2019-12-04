package Workspaces_Ga_Prod_CbaAPr0726197isPrdGaUsers

import Workspaces_Ga_Prod_CbaAPr0726197isPrdGaUsers.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "33b31510-1112-43d2-a83e-8b9e3c55f5e0"
    extId = "Workspaces_Ga_Prod_CbaAPr0726197isPrdGaUsers"
    parentId = "Workspaces_Ga_Prod"
    name = "cba-a-pr-0726197-is-prd-ga_users"

    buildType(FoundationWorkspaces_Ga_CbaAPr0726197isPrdGaUsers)
})
