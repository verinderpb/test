package Workspaces_Ga_Clab_CbaACl0841722tpdLabBeaconPaas.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Workspaces_Ga_Clab_CbaACl0841722tpdLabBeaconPaas_CustomRepoRoot : GitVcsRoot({
    uuid = "968d3130-70c9-49cf-b91a-a641d7b19f45"
    extId = "Workspaces_Ga_Clab_CbaACl0841722tpdLabBeaconPaas_CustomRepoRoot"
    name = "CustomRepoRoot"
    url = "https://vcs.cnsga.aws.prod.au.internal.cba/CBA/%env.custom-repo-name%.git"
    branch = "%env.custom-repo_branch%"
    branchSpec = "+:refs/heads/*"
    authMethod = password {
        userName = "acoe_cnsfs_githubtc"
        password = "zxx170b6439787381240e7d0e5cc79ed1a8775d03cbe80d301b"
    }
})
