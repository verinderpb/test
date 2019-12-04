package Workspaces_Ga_Prod_CbaAPr0737262dpgPrdFlareUsers

import Workspaces_Ga_Prod_CbaAPr0737262dpgPrdFlareUsers.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "ddbf2595-3571-43fe-901e-ab39895f3ade"
    extId = "Workspaces_Ga_Prod_CbaAPr0737262dpgPrdFlareUsers"
    parentId = "Workspaces_Ga_Prod"
    name = "cba-a-pr-0737262-dpg-prd-flare_users"

    buildType(TenantWorkspaces_Ga_CbaAPr0737262dpgPrdFlareUsers)
})
