package Workspaces_Ga_Prod_CbaAPr0737248isPrdGaTest

import Workspaces_Ga_Prod_CbaAPr0737248isPrdGaTest.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "51a7347d-6515-47c0-9976-9f4925395388"
    extId = "Workspaces_Ga_Prod_CbaAPr0737248isPrdGaTest"
    parentId = "Workspaces_Ga_Prod"
    name = "cba-a-pr-0737248-is-prd-ga_test"

    buildType(Workspaces_Ga_Prod_CbaCnsAwsGaProdIsOcTestWorkspace_Wipe)
    buildType(Workspaces_Ga_Prod_CbaAPr0737248isPrdGaTest_CbaAPr0737248isPrdGaTest)
})
