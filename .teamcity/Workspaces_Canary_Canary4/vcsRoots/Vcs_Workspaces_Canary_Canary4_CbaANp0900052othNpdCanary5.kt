package Workspaces_Canary_Canary4.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Vcs_Workspaces_Canary_Canary4_CbaANp0900052othNpdCanary5 : GitVcsRoot({
    uuid = "f7846781-bf47-4f91-8ae4-4f6a52ad2251"
    extId = "Workspaces_Canary_Canary4_CbaANp0900052othNpdCanary5"
    name = "cba-a-np-0900052-oth-npd-canary_5"
    pollInterval = 60
    url = "https://vcs.cnsga.aws.prod.au.internal.cba/CNS/cba-a-np-0900052-oth-npd-canary_5.git"
    branchSpec = "+:refs/heads/*"
    authMethod = password {
        userName = "acoe_cnsfs_githubtc"
        password = "zxx170b6439787381240e7d0e5cc79ed1a8775d03cbe80d301b"
    }
})
