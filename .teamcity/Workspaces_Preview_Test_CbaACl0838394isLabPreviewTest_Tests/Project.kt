package Workspaces_Preview_Test_CbaACl0838394isLabPreviewTest_Tests

import Workspaces_Preview_Test_CbaACl0838394isLabPreviewTest_Tests.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "26f18fea-6700-419f-a252-1c6d0b9d985a"
    extId = "Workspaces_Preview_Test_CbaACl0838394isLabPreviewTest_Tests"
    parentId = "Workspaces_Preview_Test_CbaACl0838394isLabPreviewTest"
    name = "tests"

    buildType(Workspaces_Preview_Test_CbaACl0838394isLabPreviewTest_Tests_Bvt)
    buildType(Workspaces_Preview_Test_CbaACl0838394isLabPreviewTest_Tests_CuratorUat)
})
