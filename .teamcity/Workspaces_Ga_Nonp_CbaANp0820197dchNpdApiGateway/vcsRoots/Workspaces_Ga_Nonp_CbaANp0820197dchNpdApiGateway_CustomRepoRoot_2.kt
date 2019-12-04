package Workspaces_Ga_Nonp_CbaANp0820197dchNpdApiGateway.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Workspaces_Ga_Nonp_CbaANp0820197dchNpdApiGateway_CustomRepoRoot_2 : GitVcsRoot({
    uuid = "7dddb352-54de-4cd1-bd18-01d059a69ea1"
    extId = "Workspaces_Ga_Nonp_CbaANp0820197dchNpdApiGateway_CustomRepoRoot_2"
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
