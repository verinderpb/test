package Workspaces_Ga_Nonp_CbaANp0820197dchNpdApiGateway.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Workspaces_Ga_Nonp_CbaANp0820197dchNpdApiGateway_WorkspaceRepoRoot : GitVcsRoot({
    uuid = "f869e5d6-61ae-4d86-b4d7-66e84dd4394a"
    extId = "Workspaces_Ga_Nonp_CbaANp0820197dchNpdApiGateway_WorkspaceRepoRoot"
    name = "WorkspaceRepoRoot"
    url = "https://vcs.cnsga.aws.prod.au.internal.cba/CNS/%env.workspace-repo-name%.git"
    branch = "master"
    branchSpec = "+:refs/heads/*"
    authMethod = password {
        userName = "acoe_cnsfs_githubtc"
        password = "zxx170b6439787381240e7d0e5cc79ed1a8775d03cbe80d301b"
    }
})
