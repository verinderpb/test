package Workspaces_Canary_Canary4.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Vcs_Workspaces_Canary_Canary4_CbaACl0900036othLabCanary15 : GitVcsRoot({
    uuid = "1b871bf5-158c-4c3d-8608-694c8a2a9156"
    extId = "Workspaces_Canary_Canary4_CbaACl0900036othLabCanary15"
    name = "cba-a-cl-0900036-oth-lab-canary_15"
    pollInterval = 60
    url = "https://vcs.cnsga.aws.prod.au.internal.cba/CNS/cba-a-cl-0900036-oth-lab-canary_15.git"
    branchSpec = "+:refs/heads/*"
    authMethod = password {
        userName = "acoe_cnsfs_githubtc"
        password = "zxx170b6439787381240e7d0e5cc79ed1a8775d03cbe80d301b"
    }
})
