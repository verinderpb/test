package Workspaces_Ga_Clab

import Workspaces_Ga_Clab.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "8056afd7-e7ad-45c7-9b62-80e71e0ed886"
    extId = "Workspaces_Ga_Clab"
    parentId = "Workspaces_Ga"
    name = "clab"

    vcsRoot(Workspaces_Ga_Clab_CustomCbaRepoVcsRoot2)
    vcsRoot(Workspaces_Ga_Clab_CustomCnsRepoVcsRoot1)
})
