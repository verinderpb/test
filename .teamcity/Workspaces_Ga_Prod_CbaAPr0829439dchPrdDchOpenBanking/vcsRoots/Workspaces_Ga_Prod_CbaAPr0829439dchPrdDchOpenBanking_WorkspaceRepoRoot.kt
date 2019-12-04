package Workspaces_Ga_Prod_CbaAPr0829439dchPrdDchOpenBanking.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Workspaces_Ga_Prod_CbaAPr0829439dchPrdDchOpenBanking_WorkspaceRepoRoot : GitVcsRoot({
    uuid = "24f28d7f-d12e-465b-91f9-e41d043ea561"
    extId = "Workspaces_Ga_Prod_CbaAPr0829439dchPrdDchOpenBanking_WorkspaceRepoRoot"
    name = "WorkspaceRepoRoot"
    url = "https://vcs.cnsga.aws.prod.au.internal.cba/CNS/%env.workspace-repo-name%.git"
    branch = "%env.branch_name%"
    branchSpec = "+:refs/heads/*"
    authMethod = password {
        userName = "acoe_cnsfs_githubtc"
        password = "zxx170b6439787381240e7d0e5cc79ed1a8775d03cbe80d301b"
    }
})
