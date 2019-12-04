package Workspaces_Ga_Nonp_CbaANp0828111dpgStgInetProxies.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Workspaces_Ga_Nonp_CbaANp0828111dpgStgInetProxies_CustomRepoRoot : GitVcsRoot({
    uuid = "47ea3a65-ee24-4141-84ce-702e956f40ba"
    extId = "Workspaces_Ga_Nonp_CbaANp0828111dpgStgInetProxies_CustomRepoRoot"
    name = "CustomRepoRoot"
    pollInterval = 60
    url = "https://vcs.cnsga.aws.prod.au.internal.cba/CBA/%env.custom-repo-name%.git"
    branch = "%env.branch_name%"
    branchSpec = "+:refs/heads/*"
    authMethod = password {
        userName = "acoe_cnsfs_githubtc"
        password = "zxx170b6439787381240e7d0e5cc79ed1a8775d03cbe80d301b"
    }
})
