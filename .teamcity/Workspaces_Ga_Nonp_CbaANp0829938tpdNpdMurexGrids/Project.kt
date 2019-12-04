package Workspaces_Ga_Nonp_CbaANp0829938tpdNpdMurexGrids

import Workspaces_Ga_Nonp_CbaANp0829938tpdNpdMurexGrids.buildTypes.*
import Workspaces_Ga_Nonp_CbaANp0829938tpdNpdMurexGrids.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "59d1fc19-0ae3-44f7-bbaf-22c442c42457"
    extId = "Workspaces_Ga_Nonp_CbaANp0829938tpdNpdMurexGrids"
    parentId = "Workspaces_Ga_Nonp"
    name = "cba-a-np-0829938-tpd-dev-murex"

    vcsRoot(Workspaces_Ga_Nonp_CbaANp0829938tpdNpdMurexGrids_WorkspaceRepoRoot)

    buildType(Workspaces_Ga_Nonp_CbaANp0829938tpdNpdMurexGrids_CbaANp0829938tpdNpdMurexGridsCu)
    buildType(Workspaces_Ga_Nonp_CbaANp0829938tpdNpdMurexGrids_CbaANp0829938tpdNpdMurexGrids)
})
