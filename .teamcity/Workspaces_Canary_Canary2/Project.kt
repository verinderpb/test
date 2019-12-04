package Workspaces_Canary_Canary2

import Workspaces_Canary_Canary2.buildTypes.*
import Workspaces_Canary_Canary2.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "c3a6eea4-b844-4edb-bfb8-9a214ed2eede"
    extId = "Workspaces_Canary_Canary2"
    parentId = "Workspaces_Canary"
    name = "Canary2"
    description = "Pipelines for the Network & Identity"

    vcsRoot(Vcs_Workspaces_Canary_Canary2_CbaANp0900049othNpdCanary3)
    vcsRoot(Workspaces_Canary_Canary2_CbaACl0900034othLabCanary11)
    vcsRoot(Vcs_Workspaces_Canary_Canary2_CbaANp0900044othNpdCanary1)
    vcsRoot(Workspaces_Canary_Canary2_CbaACl0900043othLabCanary12)

    buildType(Workspaces_Canary_Canary2_CbaANp0900049othNpdCanary3)
    buildType(Workspaces_Canary_Canary2_CbaANp0900044othNpdCanary1)
    buildType(Workspaces_Canary2_CbaACl0900043othLabCanary12)
    buildType(Workspaces_Canary2_CbaACl0900034othLabCanary11)
    buildTypesOrder = arrayListOf(Workspaces_Canary_Canary2.buildTypes.Workspaces_Canary_Canary2_CbaANp0900044othNpdCanary1, Workspaces_Canary_Canary2.buildTypes.Workspaces_Canary_Canary2_CbaANp0900049othNpdCanary3, Workspaces_Canary_Canary2.buildTypes.Workspaces_Canary2_CbaACl0900034othLabCanary11, Workspaces_Canary_Canary2.buildTypes.Workspaces_Canary2_CbaACl0900043othLabCanary12)
})
