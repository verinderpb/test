package Workspaces_Ga_Prod_CbaAPr0816565dwpPrdJamf

import Workspaces_Ga_Prod_CbaAPr0816565dwpPrdJamf.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "2af8a270-584b-40e5-9a33-b030e5b3bb9a"
    extId = "Workspaces_Ga_Prod_CbaAPr0816565dwpPrdJamf"
    parentId = "Workspaces_Ga_Prod"
    name = "cba-a-pr-0816565-dwp-prd-jamf"

    buildType(TenantWorkspaces_Ga_CbaAPr0816565dwpPrdJamf)
    buildType(TenantWorkspaces_Ga_CustomRepos_CbaAPr0816565dwpPrdJamf)
})
