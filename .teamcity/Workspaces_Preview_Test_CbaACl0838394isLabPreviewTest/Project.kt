package Workspaces_Preview_Test_CbaACl0838394isLabPreviewTest

import Workspaces_Preview_Test_CbaACl0838394isLabPreviewTest.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "c1850ebc-0210-4a4c-8ee6-1789d9eaf57d"
    extId = "Workspaces_Preview_Test_CbaACl0838394isLabPreviewTest"
    parentId = "Workspaces_Preview_Test"
    name = "cba-a-cl-0838394-is-lab-preview_test"

    buildType(Workspaces_Preview_Test_CbaACl0838394isLabPreviewTest_CbaACl0838394isLabPrevie_2)
    buildType(Workspaces_Preview_Test_CbaACl0838394isLabPreviewTest_Wipe)

    params {
        text("env.workspace_name", "cba-a-cl-0838394-is-lab-preview_test", readOnly = true, allowEmpty = false)
        text("workspace_name", "cba-a-cl-0838394-is-lab-preview_test", display = ParameterDisplay.HIDDEN, allowEmpty = false)
    }
})
