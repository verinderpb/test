package Workspaces_Ga_Prod_CbaAPr0779880isPrdGaMgmt

import Workspaces_Ga_Prod_CbaAPr0779880isPrdGaMgmt.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "90932362-6d64-42fe-885c-3d679f2b394d"
    extId = "Workspaces_Ga_Prod_CbaAPr0779880isPrdGaMgmt"
    parentId = "Workspaces_Ga_Prod"
    name = "cba-a-pr-0779880-is-prd-ga_mgmt"

    buildType(FoundationWorkspaces_Ga_CbaAPr0779880isPrdGaMgmt)
})
