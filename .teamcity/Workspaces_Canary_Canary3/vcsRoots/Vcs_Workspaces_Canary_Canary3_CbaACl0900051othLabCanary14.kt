package Workspaces_Canary_Canary3.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Vcs_Workspaces_Canary_Canary3_CbaACl0900051othLabCanary14 : GitVcsRoot({
    uuid = "91aec00d-e793-4a01-bdb9-d0cc9a56c076"
    extId = "Workspaces_Canary_Canary3_CbaACl0900051othLabCanary14"
    name = "cba-a-cl-0900051-oth-lab-canary_14"
    pollInterval = 60
    url = "https://vcs.cnsga.aws.prod.au.internal.cba/CNS/cba-a-cl-0900051-oth-lab-canary_14.git"
    branchSpec = "+:refs/heads/*"
    authMethod = password {
        userName = "acoe_cnsfs_githubtc"
        password = "zxx170b6439787381240e7d0e5cc79ed1a8775d03cbe80d301b"
    }
})
