package Workspaces_Preview_Test_CbaACl0737249isTstPreviewTest

import Workspaces_Preview_Test_CbaACl0737249isTstPreviewTest.buildTypes.*
import Workspaces_Preview_Test_CbaACl0737249isTstPreviewTest.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "2f49b639-15c6-4ada-9c2f-f736bb28aa0e"
    extId = "Workspaces_Preview_Test_CbaACl0737249isTstPreviewTest"
    parentId = "Workspaces_Preview_Test"
    name = "cba-a-cl-0737249-is-tst-preview_test"

    vcsRoot(Workspaces_Preview_Test_CbaACl0737249isTstPreviewTest_CbaACl0737249isTstPrevie_3)
    vcsRoot(Workspaces_Preview_Test_CbaACl0737249isTstPreviewTest_CbaANp0737247isTstPreviewT)

    buildType(Workspaces_Preview_Test_CbaACl0737249isTstPreviewTest_Wipe)
    buildType(Workspaces_Preview_Test_CbaCnsAwsPreviewClabIsOcTest_CbaCnsAwsPreviewClabIsOcT_2)
    buildType(Workspaces_Preview_Test_CbaACl0737249isTstPreviewTest_CbaACl0737249isTstPreviewT)

    params {
        text("env.workspace_name", "cba-a-cl-0737249-is-tst-preview_test", readOnly = true, allowEmpty = false)
    }
})
