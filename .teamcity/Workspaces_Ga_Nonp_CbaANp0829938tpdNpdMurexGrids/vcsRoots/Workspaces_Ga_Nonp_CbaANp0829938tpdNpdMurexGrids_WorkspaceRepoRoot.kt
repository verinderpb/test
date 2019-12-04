package Workspaces_Ga_Nonp_CbaANp0829938tpdNpdMurexGrids.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Workspaces_Ga_Nonp_CbaANp0829938tpdNpdMurexGrids_WorkspaceRepoRoot : GitVcsRoot({
    uuid = "6e739205-407a-4719-8179-1a253ddf6ae7"
    extId = "Workspaces_Ga_Nonp_CbaANp0829938tpdNpdMurexGrids_WorkspaceRepoRoot"
    name = "WorkspaceRepoRoot"
    url = "https://vcs.cnsga.aws.prod.au.internal.cba/CNS/%env.workspace-repo-name%.git"
    branch = "%env.branch_name%"
    branchSpec = "+:refs/heads/*"
    authMethod = password {
        userName = "acoe_cnsfs_githubtc"
        password = "zxx170b6439787381240e7d0e5cc79ed1a8775d03cbe80d301b"
    }
})
