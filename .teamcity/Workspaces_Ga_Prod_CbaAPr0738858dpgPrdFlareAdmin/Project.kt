package Workspaces_Ga_Prod_CbaAPr0738858dpgPrdFlareAdmin

import Workspaces_Ga_Prod_CbaAPr0738858dpgPrdFlareAdmin.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "653fbd55-b5b2-4ac3-ace2-c0ab2d942b1c"
    extId = "Workspaces_Ga_Prod_CbaAPr0738858dpgPrdFlareAdmin"
    parentId = "Workspaces_Ga_Prod"
    name = "cba-a-pr-0738858-dpg-prd-flare_admin"

    buildType(TenantWorkspaces_Ga_CbaAPr0738858dpgPrdFlareAdmin)
})
