package Workspaces_Ga_Nonp_CbaANp0891511deaSitLogitMgmt

import Workspaces_Ga_Nonp_CbaANp0891511deaSitLogitMgmt.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "814eb225-c1bc-42ef-a6f5-18cc2eff143d"
    extId = "Workspaces_Ga_Nonp_CbaANp0891511deaSitLogitMgmt"
    parentId = "Workspaces_Ga_Nonp"
    name = "cba-a-np-0891511-dea-sit-logit_mgmt"

    buildType(Workspaces_Ga_Nonp_CbaANp0891511deaSitLogitMgmt_CbaANp0891511deaSitLogitMgmtCust)
    buildType(Workspaces_Ga_Nonp_CbaANp0891511deaSitLogitMgmt_CbaANp0891511deaSitLogitMgmt)
})
