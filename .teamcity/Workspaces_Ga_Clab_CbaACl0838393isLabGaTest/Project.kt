package Workspaces_Ga_Clab_CbaACl0838393isLabGaTest

import Workspaces_Ga_Clab_CbaACl0838393isLabGaTest.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "090f513b-2e74-4deb-aa58-ac1b9dae04c5"
    extId = "Workspaces_Ga_Clab_CbaACl0838393isLabGaTest"
    parentId = "Workspaces_Ga_Clab"
    name = "cba-a-cl-0838393-is-lab-ga_test"

    buildType(Workspaces_Ga_Clab_CbaACl0838393isLabGaTest_Wipe)
    buildType(Workspaces_Ga_Clab_CbaACl0838393isLabGaTest_CbaACl0838393isLabGaTest)
    buildType(Workspaces_Ga_Clab_CbaACl0838393isLabGaTest_CbaACl0838393isLabGaTestCustom)

    params {
        param("reverse.dep.*.workspace_repo_name", "")
    }
})
