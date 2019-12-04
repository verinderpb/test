package Workspaces_Canary_Canary4

import Workspaces_Canary_Canary4.buildTypes.*
import Workspaces_Canary_Canary4.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "d213f633-4141-46fe-9c22-2e920fd70d2b"
    extId = "Workspaces_Canary_Canary4"
    parentId = "Workspaces_Canary"
    name = "Canary4"
    description = "Pipelines for the Workspaces & Security"

    vcsRoot(Vcs_Workspaces_Canary_Canary4_CbaACl0900050othLabCanary16)
    vcsRoot(Vcs_Workspaces_Canary_Canary4_CbaACl0900036othLabCanary15)
    vcsRoot(Vcs_Workspaces_Canary_Canary4_CbaANp0900040othNpdCanary8)
    vcsRoot(Vcs_Workspaces_Canary_Canary4_CbaANp0900052othNpdCanary5)

    buildType(Workspaces_Canary_Canary4_CbaACl0900050othLabCanary16)
    buildType(Workspaces_Canary_Canary4_CbaACl0900036othLabCanary15)
    buildType(Workspaces_Canary_Canary4_CbaANp0900040othNpdCanary8)
    buildType(Workspaces_Canary_Canary4_CbaANp0900052othNpdCanary5)
    buildTypesOrder = arrayListOf(Workspaces_Canary_Canary4.buildTypes.Workspaces_Canary_Canary4_CbaANp0900052othNpdCanary5, Workspaces_Canary_Canary4.buildTypes.Workspaces_Canary_Canary4_CbaANp0900040othNpdCanary8, Workspaces_Canary_Canary4.buildTypes.Workspaces_Canary_Canary4_CbaACl0900036othLabCanary15, Workspaces_Canary_Canary4.buildTypes.Workspaces_Canary_Canary4_CbaACl0900050othLabCanary16)
})
