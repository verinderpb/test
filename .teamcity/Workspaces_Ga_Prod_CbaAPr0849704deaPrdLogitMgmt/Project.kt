package Workspaces_Ga_Prod_CbaAPr0849704deaPrdLogitMgmt

import Workspaces_Ga_Prod_CbaAPr0849704deaPrdLogitMgmt.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "d275602e-a60a-431f-a2f1-5bdb4c16d3f8"
    extId = "Workspaces_Ga_Prod_CbaAPr0849704deaPrdLogitMgmt"
    parentId = "Workspaces_Ga_Prod"
    name = "cba-a-pr-0849704-dea-prd-logit_mgmt"

    buildType(Workspaces_Ga_Prod_CbaAPr0849704deaPrdLogitMgmt_CbaAPr0849704deaPrdLogitMgmtCust)
    buildType(Workspaces_Ga_Prod_CbaAPr0849704deaPrdLogitMgmt_CbaAPr0849704deaPrdLogitMgmt)
})
