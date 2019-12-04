package Workspaces_Ga_Prod_CbaAPr0738859dpgPrdFlareServices

import Workspaces_Ga_Prod_CbaAPr0738859dpgPrdFlareServices.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "6d74aec9-b1d5-4b99-b659-9265b7500a47"
    extId = "Workspaces_Ga_Prod_CbaAPr0738859dpgPrdFlareServices"
    parentId = "Workspaces_Ga_Prod"
    name = "cba-a-pr-0738859-dpg-prd-flare_services"

    buildType(TenantWorkspaces_Ga_CbaAPr0738859dpgPrdFlareServices)
})
