package Workspaces_Ga_Prod_CbaAPr0726196isPrdGaMgmt

import Workspaces_Ga_Prod_CbaAPr0726196isPrdGaMgmt.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "919fbc15-66b2-4c73-abea-1f2af6acf8b0"
    extId = "Workspaces_Ga_Prod_CbaAPr0726196isPrdGaMgmt"
    parentId = "Workspaces_Ga_Prod"
    name = "cba-a-pr-0726196-is-prd-ga_mgmt"

    buildType(FoundationWorkspaces_CbaAPr0726196isPrdGaMgmt)
})
