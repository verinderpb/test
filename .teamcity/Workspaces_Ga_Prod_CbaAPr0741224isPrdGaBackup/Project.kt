package Workspaces_Ga_Prod_CbaAPr0741224isPrdGaBackup

import Workspaces_Ga_Prod_CbaAPr0741224isPrdGaBackup.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "f5d7bd52-5f1b-4eac-92e1-485edb5a5204"
    extId = "Workspaces_Ga_Prod_CbaAPr0741224isPrdGaBackup"
    parentId = "Workspaces_Ga_Prod"
    name = "cba-a-pr-0741224-is-prd-ga_backup"

    buildType(FoundationWorkspaces_Ga_CbaAPr0741224isPrdGaBackup)
})
