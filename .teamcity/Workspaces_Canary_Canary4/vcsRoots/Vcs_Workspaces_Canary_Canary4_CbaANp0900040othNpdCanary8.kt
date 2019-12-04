package Workspaces_Canary_Canary4.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Vcs_Workspaces_Canary_Canary4_CbaANp0900040othNpdCanary8 : GitVcsRoot({
    uuid = "ddde988c-8a4a-41c6-96f2-cd1748b2cb09"
    extId = "Workspaces_Canary_Canary4_CbaANp0900040othNpdCanary8"
    name = "cba-a-np-0900040-oth-npd-canary_8"
    pollInterval = 60
    url = "https://vcs.cnsga.aws.prod.au.internal.cba/CNS/cba-a-np-0900040-oth-npd-canary_8.git"
    branchSpec = "+:refs/heads/*"
    authMethod = password {
        userName = "acoe_cnsfs_githubtc"
        password = "zxx170b6439787381240e7d0e5cc79ed1a8775d03cbe80d301b"
    }
})
