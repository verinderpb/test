package Workspaces_Ga_Prod_CbaAPr0885564isPrdTgwGaTest

import Workspaces_Ga_Prod_CbaAPr0885564isPrdTgwGaTest.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "b54eb9e2-fe70-45c8-8a8e-888594ca0408"
    extId = "Workspaces_Ga_Prod_CbaAPr0885564isPrdTgwGaTest"
    parentId = "Workspaces_Ga_Prod"
    name = "cba-a-pr-0885564-is-prd-tgw_ga_test"

    buildType(Workspaces_Ga_Prod_CbaAPr0885564isPrdTgwGaTest_Wipe)
    buildType(Workspaces_Ga_Prod_CbaAPr0885564isPrdTgwGaTest_CbaAPr0885564isPrdTgwGaTestCustom)
    buildType(Workspaces_Ga_Prod_CbaAPr0885564isPrdTgwGaTest_CbaAPr0885564isPrdTgwGaTest)
})
