package Workspaces_Canary_Canary3.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Vcs_Workspaces_Canary_Canary3_CbaANp0900047othNpdCanary6 : GitVcsRoot({
    uuid = "dfb50396-93e1-4232-81d0-4307b514c36a"
    extId = "Workspaces_Canary_Canary3_CbaANp0900047othNpdCanary6"
    name = "cba-a-np-0900047-oth-npd-canary_6"
    pollInterval = 60
    url = "https://vcs.cnsga.aws.prod.au.internal.cba/CNS/cba-a-np-0900047-oth-npd-canary_6.git"
    branchSpec = "+:refs/heads/*"
    authMethod = password {
        userName = "acoe_cnsfs_githubtc"
        password = "zxx170b6439787381240e7d0e5cc79ed1a8775d03cbe80d301b"
    }
})
