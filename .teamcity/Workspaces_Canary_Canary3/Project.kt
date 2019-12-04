package Workspaces_Canary_Canary3

import Workspaces_Canary_Canary3.buildTypes.*
import Workspaces_Canary_Canary3.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "e6d28918-8c35-4c84-95f8-f03a17f34bf4"
    extId = "Workspaces_Canary_Canary3"
    parentId = "Workspaces_Canary"
    name = "Canary3"
    description = "Pipelines for the Workspaces & Security"

    vcsRoot(Vcs_Workspaces_Canary_Canary3_CbaACl0900051othLabCanary14)
    vcsRoot(Vcs_Workspaces_Canary_Canary3_CbaACl0900041othLabCanary13)
    vcsRoot(Vcs_Workspaces_Canary_Canary3_CbaANp0900047othNpdCanary6)
    vcsRoot(Workspaces_Canary_Canary3_CbaANp0900044othNpdCanary1)

    buildType(Workspaces_Canary_Canary3_CbaACl0900051othLabCanary14)
    buildType(Workspaces_Canary_Canary3_CbaACl0900041othLabCanary13)
    buildType(Workspaces_Canary_Canary3_CbaANp0900047othNpdCanary6)
    buildType(Workspaces_Canary_Canary3_CbaANp0900042othNpdCanary7)
    buildTypesOrder = arrayListOf(Workspaces_Canary_Canary3.buildTypes.Workspaces_Canary_Canary3_CbaANp0900042othNpdCanary7, Workspaces_Canary_Canary3.buildTypes.Workspaces_Canary_Canary3_CbaANp0900047othNpdCanary6, Workspaces_Canary_Canary3.buildTypes.Workspaces_Canary_Canary3_CbaACl0900041othLabCanary13, Workspaces_Canary_Canary3.buildTypes.Workspaces_Canary_Canary3_CbaACl0900051othLabCanary14)
})
