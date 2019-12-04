package Workspaces_Ga_Clab_CbaACl0737250isTstGaTest

import Workspaces_Ga_Clab_CbaACl0737250isTstGaTest.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "ca886114-99b1-4f66-b090-83d697c919a4"
    extId = "Workspaces_Ga_Clab_CbaACl0737250isTstGaTest"
    parentId = "Workspaces_Ga_Clab"
    name = "cba-a-cl-0737250-is-tst-ga_test"

    buildType(Workspaces_Ga_Clab_CbaACl0737250isTstGaTest_CbaACl0737250isTstGaTest)
    buildType(Workspaces_Ga_Clab_CbaCnsAwsGaClabIsOcTestWorkspace_Wipe)

    params {
        param("env.workspace_name", "cba-a-cl-0737250-is-tst-ga_test")
    }
})
