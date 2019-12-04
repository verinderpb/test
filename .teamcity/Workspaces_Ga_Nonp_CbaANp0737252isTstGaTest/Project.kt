package Workspaces_Ga_Nonp_CbaANp0737252isTstGaTest

import Workspaces_Ga_Nonp_CbaANp0737252isTstGaTest.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "9c51319e-0319-4f1a-8df7-42bb0b2ba7f5"
    extId = "Workspaces_Ga_Nonp_CbaANp0737252isTstGaTest"
    parentId = "Workspaces_Ga_Nonp"
    name = "cba-a-np-0737252-is-tst-ga_test"

    buildType(Workspaces_Ga_Nonp_CbaANp0737252isTstGaTest_CbaANp0737252isTstGaTest)
    buildType(Workspaces_Ga_Nonp_CbaCnsAwsGaNonpIsOcTestWorkspace_Wipe)
})
