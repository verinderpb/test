package Workspaces_Ga_Prod_CbaAPr0822888csecPrdTrading

import Workspaces_Ga_Prod_CbaAPr0822888csecPrdTrading.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "67365e3d-40ba-4beb-b160-bd1de39d9b4a"
    extId = "Workspaces_Ga_Prod_CbaAPr0822888csecPrdTrading"
    parentId = "Workspaces_Ga_Prod"
    name = "cba-a-pr-0822888-csec-prd-trading"

    buildType(TenantWorkspaces_Ga_CustomRepos_CbaAPr0822888csecPrdTradingCustom)
    buildType(TenantWorkspaces_Ga_CbaAPr0822888csecPrdTrading)
})
