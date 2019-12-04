package Workspaces_Preview_Test_CbaACl0737249isTstPreviewTest_Tests

import Workspaces_Preview_Test_CbaACl0737249isTstPreviewTest_Tests.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "b83ee2fb-b676-4fb0-8c04-f217b84ef8bb"
    extId = "Workspaces_Preview_Test_CbaACl0737249isTstPreviewTest_Tests"
    parentId = "Workspaces_Preview_Test_CbaACl0737249isTstPreviewTest"
    name = "tests"

    buildType(Workspaces_Preview_Test_CbaACl0737249isTstPreviewTest_Tests_Bvt)
})
