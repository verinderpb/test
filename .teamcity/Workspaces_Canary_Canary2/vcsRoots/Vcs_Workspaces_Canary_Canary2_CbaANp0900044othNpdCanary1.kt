package Workspaces_Canary_Canary2.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Vcs_Workspaces_Canary_Canary2_CbaANp0900044othNpdCanary1 : GitVcsRoot({
    uuid = "cec2f683-6a0d-4cb3-a80f-a3ce570b2345"
    extId = "Workspaces_Canary_Canary2_CbaANp0900044othNpdCanary1"
    name = "cba-a-np-0900044-oth-npd-canary_1"
    pollInterval = 60
    url = "https://vcs.cnsga.aws.prod.au.internal.cba/CNS/cba-a-np-0900044-oth-npd-canary_1.git"
    branchSpec = "+:refs/heads/*"
    authMethod = password {
        userName = "acoe_cnsfs_githubtc"
        password = "zxx170b6439787381240e7d0e5cc79ed1a8775d03cbe80d301b"
    }
})
