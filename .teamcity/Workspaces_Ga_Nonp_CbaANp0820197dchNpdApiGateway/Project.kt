package Workspaces_Ga_Nonp_CbaANp0820197dchNpdApiGateway

import Workspaces_Ga_Nonp_CbaANp0820197dchNpdApiGateway.buildTypes.*
import Workspaces_Ga_Nonp_CbaANp0820197dchNpdApiGateway.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "36b1ce92-e760-4ca9-94f1-296acfd10255"
    extId = "Workspaces_Ga_Nonp_CbaANp0820197dchNpdApiGateway"
    parentId = "Workspaces_Ga_Nonp"
    name = "cba-a-np-0820197-dch-npd-api_gateway"

    vcsRoot(Workspaces_Ga_Nonp_CbaANp0820197dchNpdApiGateway_CbaANp0820197dchNpdApiGateway)
    vcsRoot(Workspaces_Ga_Nonp_CbaANp0820197dchNpdApiGateway_CustomRepoRoot_2)
    vcsRoot(Workspaces_Ga_Nonp_CbaANp0820197dchNpdApiGateway_CustomRepoRoot)
    vcsRoot(Workspaces_Ga_Nonp_CbaANp0820197dchNpdApiGateway_CbaADchOpenbankingCustom)
    vcsRoot(Workspaces_Ga_Nonp_CbaANp0820197dchNpdApiGateway_WorkspaceRepoRoot)

    buildType(Workspaces_Ga_Nonp_CbaANp0820197dchNpdApiGateway_CbaANp0820197dchNpdApiGatewayCu)
    buildType(TenantWorkspaces_Ga_CbaANp0820197dchNpdApiGateway)
})
