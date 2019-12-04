package Workspaces_Ga_Clab_CbaACl0741218csecPocTrading

import Workspaces_Ga_Clab_CbaACl0741218csecPocTrading.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "d8c88258-c162-4878-99ec-f14925404834"
    extId = "Workspaces_Ga_Clab_CbaACl0741218csecPocTrading"
    parentId = "Workspaces_Ga_Clab"
    name = "cba-a-cl-0741218-csec-poc-trading"

    buildType(TenantWorkspaces_Ga_CbaACl0741218csecPocTrading)
    buildType(TenantWorkspaces_Ga_CbaACl0741218csecPocTradingCustom)
})
