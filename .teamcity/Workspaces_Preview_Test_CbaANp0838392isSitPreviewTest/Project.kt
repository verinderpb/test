package Workspaces_Preview_Test_CbaANp0838392isSitPreviewTest

import Workspaces_Preview_Test_CbaANp0838392isSitPreviewTest.buildTypes.*
import Workspaces_Preview_Test_CbaANp0838392isSitPreviewTest.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "9a5f7d88-2e70-428d-b6e1-268335def55f"
    extId = "Workspaces_Preview_Test_CbaANp0838392isSitPreviewTest"
    parentId = "Workspaces_Preview_Test"
    name = "cba-a-np-0838392-is-sit-preview_test"

    vcsRoot(Workspaces_Preview_Test_CbaANp0838392isSitPreviewTest_CbaANp0838392isSitPreviewT)

    buildType(Workspaces_Preview_Test_CbaANp0838392isSitPreviewTest_CbaANp0838392isSitPrevie_2)
    buildType(Workspaces_Preview_Test_CbaANp0838392isSitPreviewTest_Wipe)
    buildType(Workspaces_Ga_Nonp_CbaANp0838392isSitPreviewTest_CbaANp0838392isSitPreviewTestCu)

    params {
        text("env.workspace_name", "cba-a-np-0838392-is-sit-preview_test", readOnly = true, allowEmpty = false)
    }
})
