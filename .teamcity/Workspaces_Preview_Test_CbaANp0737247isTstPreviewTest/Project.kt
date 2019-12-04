package Workspaces_Preview_Test_CbaANp0737247isTstPreviewTest

import Workspaces_Preview_Test_CbaANp0737247isTstPreviewTest.buildTypes.*
import Workspaces_Preview_Test_CbaANp0737247isTstPreviewTest.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "811f1d3f-9861-4334-ad1f-e303dc626c96"
    extId = "Workspaces_Preview_Test_CbaANp0737247isTstPreviewTest"
    parentId = "Workspaces_Preview_Test"
    name = "cba-a-np-0737247-is-tst-preview_test"

    vcsRoot(Workspaces_Preview_Test_CbaANp0737247isTstPreviewTest_CbaANp0737247isTstPrevie_2)

    buildType(Workspaces_Preview_Test_CbaANp0737247isTstPreviewTest_CbaANp0737247isTstPreviewT)
    buildType(Workspaces_Preview_Test_CbaANp0737247isTstPreviewTest_Wipe)

    params {
        param("env.workspace_name", "cba-a-np-0737247-is-tst-preview_test")
    }
})
