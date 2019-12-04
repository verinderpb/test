package Workspaces_Ga_Nonp_CbaANp0726194isTstGaMgmt

import Workspaces_Ga_Nonp_CbaANp0726194isTstGaMgmt.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "a25c4b66-62d0-4f62-94e4-e8b96969cd41"
    extId = "Workspaces_Ga_Nonp_CbaANp0726194isTstGaMgmt"
    parentId = "Workspaces_Ga_Nonp"
    name = "cba-a-np-0726194-is-tst-ga_mgmt"

    buildType(FoundationWorkspaces_CbaANp0726194isTstGaMgmt)
})
