package Workspaces_Ga_Prod_CbaAPr0827916dpgPrdInetProxies.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Workspaces_Ga_Prod_CbaAPr0827916dpgPrdInetProxies_WorkspaceRepoRoot : GitVcsRoot({
    uuid = "1d91ccbc-4d3d-4db7-8b98-65dcd833cc45"
    extId = "Workspaces_Ga_Prod_CbaAPr0827916dpgPrdInetProxies_WorkspaceRepoRoot"
    name = "WorkspaceRepoRoot"
    url = "https://vcs.cnsga.aws.prod.au.internal.cba/CNS/cba-a-pr-0827916-dpg-prd-inet_proxies.git"
    branchSpec = "+:refs/heads/*"
    authMethod = password {
        userName = "acoe_cnsfs_githubtc"
        password = "zxx170b6439787381240e7d0e5cc79ed1a8775d03cbe80d301b"
    }
})
