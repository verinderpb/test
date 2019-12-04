package Workspaces_Ga_Nonp_CbaANp0849703deaNpdLogitMgmt

import Workspaces_Ga_Nonp_CbaANp0849703deaNpdLogitMgmt.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "e00f59a2-e37c-4c4a-8ac3-9fd1990f3edc"
    extId = "Workspaces_Ga_Nonp_CbaANp0849703deaNpdLogitMgmt"
    parentId = "Workspaces_Ga_Nonp"
    name = "cba-a-np-0849703-dea-npd-logit_mgmt"

    buildType(Workspaces_Ga_Nonp_CbaANp0849703deaNpdLogitMgmt_CbaANp0849703deaNpdLogitMgmtCust)
    buildType(Workspaces_Ga_Nonp_CbaANp0849703deaNpdLogitMgmt_CbaANp0849703deaNpdLogitMgmt)
})
