package Workspaces_Ga_Clab_CbaACl0737257isTstGaMgmt

import Workspaces_Ga_Clab_CbaACl0737257isTstGaMgmt.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "14803e8a-b39d-4676-98f9-9fd075e245ee"
    extId = "Workspaces_Ga_Clab_CbaACl0737257isTstGaMgmt"
    parentId = "Workspaces_Ga_Clab"
    name = "cba-a-cl-0737257-is-tst-ga_mgmt"

    buildType(FoundationWorkspaces_CbaACl0737257isTstGaMgmt)
})
