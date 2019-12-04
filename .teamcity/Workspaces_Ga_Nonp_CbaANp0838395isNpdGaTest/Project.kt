package Workspaces_Ga_Nonp_CbaANp0838395isNpdGaTest

import Workspaces_Ga_Nonp_CbaANp0838395isNpdGaTest.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "c255c625-842c-4392-a60d-f5c11a7f413e"
    extId = "Workspaces_Ga_Nonp_CbaANp0838395isNpdGaTest"
    parentId = "Workspaces_Ga_Nonp"
    name = "cba-a-np-0838395-is-npd-ga_test"

    buildType(Workspaces_Ga_Nonp_CbaANp0838395isNpdGaTest_CbaANp0838395isNpdGaTestCustom)
    buildType(Workspaces_Ga_Nonp_CbaANp0838395isNpdGaTest_CbaANp0838395isNpdGaTest)
    buildType(Workspaces_Ga_Nonp_CbaANp0838395isNpdGaTest_Wipe)
})
