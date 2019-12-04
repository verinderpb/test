package Workspaces_Canary_Canary3.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Vcs_Workspaces_Canary_Canary3_CbaACl0900041othLabCanary13 : GitVcsRoot({
    uuid = "9bbe2d76-6d1c-4188-bdbc-75a797fe90c6"
    extId = "Workspaces_Canary_Canary3_CbaACl0900041othLabCanary13"
    name = "cba-a-cl-0900041-oth-lab-canary_13"
    pollInterval = 60
    url = "https://vcs.cnsga.aws.prod.au.internal.cba/CNS/cba-a-cl-0900041-oth-lab-canary_13.git"
    branchSpec = "+:refs/heads/*"
    authMethod = password {
        userName = "acoe_cnsfs_githubtc"
        password = "zxx170b6439787381240e7d0e5cc79ed1a8775d03cbe80d301b"
    }
})
