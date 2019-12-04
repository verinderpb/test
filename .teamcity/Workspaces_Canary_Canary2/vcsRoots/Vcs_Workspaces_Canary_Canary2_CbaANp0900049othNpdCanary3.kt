package Workspaces_Canary_Canary2.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Vcs_Workspaces_Canary_Canary2_CbaANp0900049othNpdCanary3 : GitVcsRoot({
    uuid = "6c455fec-d401-4c27-a858-351bc9db40f6"
    extId = "Workspaces_Canary_Canary2_CbaANp0900049othNpdCanary3"
    name = "cba-a-np-0900049-oth-npd-canary_3"
    pollInterval = 60
    url = "https://vcs.cnsga.aws.prod.au.internal.cba/CNS/cba-a-np-0900049-oth-npd-canary_3.git"
    branchSpec = "+:refs/heads/*"
    authMethod = password {
        userName = "acoe_cnsfs_githubtc"
        password = "zxx170b6439787381240e7d0e5cc79ed1a8775d03cbe80d301b"
    }
})
