package Workspaces_Ga_Nonp_CbaANp0822886csecNpdTradingStg

import Workspaces_Ga_Nonp_CbaANp0822886csecNpdTradingStg.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "6abb328f-ca3f-4d1a-84ab-aa03dfa3ad79"
    extId = "Workspaces_Ga_Nonp_CbaANp0822886csecNpdTradingStg"
    parentId = "Workspaces_Ga_Nonp"
    name = "cba-a-np-0822886-csec-npd-trading_stg"

    buildType(TenantWorkspaces_Ga_CbaANp0822886csecNpdTradingStg)
    buildType(TenantWorkspaces_Ga_CustomRepos_CbaANp0822886csecNpdTradingStgCustom)
})
