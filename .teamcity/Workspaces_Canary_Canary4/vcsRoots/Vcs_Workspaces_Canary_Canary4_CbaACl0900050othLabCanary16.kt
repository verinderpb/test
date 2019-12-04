package Workspaces_Canary_Canary4.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Vcs_Workspaces_Canary_Canary4_CbaACl0900050othLabCanary16 : GitVcsRoot({
    uuid = "1eeed531-56d0-438b-8505-544d7dc2101a"
    extId = "Workspaces_Canary_Canary4_CbaACl0900050othLabCanary16"
    name = "cba-a-cl-0900050-oth-lab-canary_16"
    pollInterval = 60
    url = "https://vcs.cnsga.aws.prod.au.internal.cba/CNS/cba-a-cl-0900050-oth-lab-canary_16.git"
    branchSpec = "+:refs/heads/*"
    authMethod = password {
        userName = "acoe_cnsfs_githubtc"
        password = "zxx170b6439787381240e7d0e5cc79ed1a8775d03cbe80d301b"
    }
})
