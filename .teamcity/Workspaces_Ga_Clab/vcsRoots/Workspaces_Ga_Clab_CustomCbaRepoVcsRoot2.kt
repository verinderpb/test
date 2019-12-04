package Workspaces_Ga_Clab.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Workspaces_Ga_Clab_CustomCbaRepoVcsRoot2 : GitVcsRoot({
    uuid = "3964f1ed-5b50-4a8c-a815-dc6428cd3c8b"
    extId = "Workspaces_Ga_Clab_CustomCbaRepoVcsRoot2"
    name = "custom_cba_repo_vcs_root (2)"
    pollInterval = 60
    url = "https://vcs.cnsga.aws.prod.au.internal.cba/CBA/%custom.cba.repo.name%.git"
    branch = "%custom.cba.repo.default.branch%"
    branchSpec = "%custom.cba.repo.branch.specification%"
    authMethod = password {
        userName = "acoe_cnsfs_githubtc"
        password = "zxx170b6439787381240e7d0e5cc79ed1a8775d03cbe80d301b"
    }
})
