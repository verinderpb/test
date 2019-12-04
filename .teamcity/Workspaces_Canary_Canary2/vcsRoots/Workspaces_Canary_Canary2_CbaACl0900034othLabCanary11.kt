package Workspaces_Canary_Canary2.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Workspaces_Canary_Canary2_CbaACl0900034othLabCanary11 : GitVcsRoot({
    uuid = "e7a67298-7c83-410a-9fbd-529ee8fd8ded"
    extId = "Workspaces_Canary_Canary2_CbaACl0900034othLabCanary11"
    name = "cba-a-cl-0900034-oth-lab-canary_11"
    pollInterval = 60
    url = "https://vcs.cnsga.aws.prod.au.internal.cba/CNS/cba-a-cl-0900034-oth-lab-canary_11.git"
    branchSpec = "+:refs/heads/*"
    authMethod = password {
        userName = "acoe_cnsfs_githubtc"
        password = "zxx170b6439787381240e7d0e5cc79ed1a8775d03cbe80d301b"
    }
})
