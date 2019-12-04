package Workspaces_Canary_Canary2.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Workspaces_Canary_Canary2_CbaACl0900043othLabCanary12 : GitVcsRoot({
    uuid = "c9a39612-0b42-4ef6-9bcd-c3c815deb9e3"
    extId = "Workspaces_Canary_Canary2_CbaACl0900043othLabCanary12"
    name = "cba-a-cl-0900043-oth-lab-canary_12"
    pollInterval = 60
    url = "https://vcs.cnsga.aws.prod.au.internal.cba/CNS/cba-a-cl-0900043-oth-lab-canary_12.git"
    branchSpec = "+:refs/heads/*"
    authMethod = password {
        userName = "acoe_cnsfs_githubtc"
        password = "zxx170b6439787381240e7d0e5cc79ed1a8775d03cbe80d301b"
    }
})
