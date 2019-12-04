package Workspaces_Ga_Clab.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Workspaces_Ga_Clab_CustomCnsRepoVcsRoot1 : GitVcsRoot({
    uuid = "2c44147c-7392-4b6b-aad0-b8c38e2308c2"
    extId = "Workspaces_Ga_Clab_CustomCnsRepoVcsRoot1"
    name = "custom_cns_repo_vcs_root (1)"
    pollInterval = 60
    url = "https://vcs.cnsga.aws.prod.au.internal.cba/CNS/%custom.cns.repo.name%.git"
    branch = "%custom.cns.repo.default.branch%"
    branchSpec = "%custom.cns.repo.branch.specification%"
    authMethod = password {
        userName = "acoe_cnsfs_githubtc"
        password = "zxx170b6439787381240e7d0e5cc79ed1a8775d03cbe80d301b"
    }
})
