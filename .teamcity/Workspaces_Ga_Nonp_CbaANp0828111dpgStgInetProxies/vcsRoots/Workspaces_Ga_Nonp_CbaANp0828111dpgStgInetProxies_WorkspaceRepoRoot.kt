package Workspaces_Ga_Nonp_CbaANp0828111dpgStgInetProxies.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Workspaces_Ga_Nonp_CbaANp0828111dpgStgInetProxies_WorkspaceRepoRoot : GitVcsRoot({
    uuid = "720f3c4c-9054-48a3-842f-cd9eb726ed39"
    extId = "Workspaces_Ga_Nonp_CbaANp0828111dpgStgInetProxies_WorkspaceRepoRoot"
    name = "WorkspaceRepoRoot"
    url = "https://vcs.cnsga.aws.prod.au.internal.cba/CNS/%env.workspace-repo-name%.git"
    branch = "master"
    branchSpec = "+:refs/heads/*"
    authMethod = password {
        userName = "acoe_cnsfs_githubtc"
        password = "zxx170b6439787381240e7d0e5cc79ed1a8775d03cbe80d301b"
    }
})
