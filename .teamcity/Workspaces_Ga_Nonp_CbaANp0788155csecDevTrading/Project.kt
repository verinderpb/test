package Workspaces_Ga_Nonp_CbaANp0788155csecDevTrading

import Workspaces_Ga_Nonp_CbaANp0788155csecDevTrading.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "30e35cf1-d1e4-4069-bca2-02ab51a398ae"
    extId = "Workspaces_Ga_Nonp_CbaANp0788155csecDevTrading"
    parentId = "Workspaces_Ga_Nonp"
    name = "cba-a-np-0788155-csec-dev-trading"

    buildType(TenantWorkspaces_Ga_CbaANp0788155csecDevTradingCustom)
    buildType(TenantWorkspaces_Ga_CbaANp0788155cscDevTrading)
})
