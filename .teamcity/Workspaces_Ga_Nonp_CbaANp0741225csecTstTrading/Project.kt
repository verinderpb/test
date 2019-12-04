package Workspaces_Ga_Nonp_CbaANp0741225csecTstTrading

import Workspaces_Ga_Nonp_CbaANp0741225csecTstTrading.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "7737a220-92aa-4c70-bf8d-19002804ee6c"
    extId = "Workspaces_Ga_Nonp_CbaANp0741225csecTstTrading"
    parentId = "Workspaces_Ga_Nonp"
    name = "cba-a-np-0741225-csec-tst-trading"

    buildType(TenantWorkspaces_Ga_CbaANp0741225csecTstTradingCustom)
    buildType(TenantWorkspaces_Ga_CbaANp0741225csecTstTrading)
})
