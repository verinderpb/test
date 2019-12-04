package Workspaces_Canary_Canary3.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Workspaces_Canary_Canary3_CbaANp0900044othNpdCanary1 : GitVcsRoot({
    uuid = "47f9662a-3861-4d7c-bc35-f31a52157a58"
    extId = "Workspaces_Canary_Canary3_CbaANp0900044othNpdCanary1"
    name = "cba-a-np-0900042-oth-npd-canary_7"
    pollInterval = 60
    url = "https://vcs.cnsga.aws.prod.au.internal.cba/CNS/cba-a-np-0900042-oth-npd-canary_7.git"
    branchSpec = "+:refs/heads/*"
    authMethod = password {
        userName = "acoe_cnsfs_githubtc"
        password = "zxx170b6439787381240e7d0e5cc79ed1a8775d03cbe80d301b"
    }
})
