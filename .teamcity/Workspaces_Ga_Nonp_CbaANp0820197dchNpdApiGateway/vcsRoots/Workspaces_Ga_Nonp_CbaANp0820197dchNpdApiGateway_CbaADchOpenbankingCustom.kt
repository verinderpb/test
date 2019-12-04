package Workspaces_Ga_Nonp_CbaANp0820197dchNpdApiGateway.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Workspaces_Ga_Nonp_CbaANp0820197dchNpdApiGateway_CbaADchOpenbankingCustom : GitVcsRoot({
    uuid = "250ccfd9-8666-4b8e-8006-9cae31867ef7"
    extId = "Workspaces_Ga_Nonp_CbaANp0820197dchNpdApiGateway_CbaADchOpenbankingCustom"
    name = "cba-a-dch-openbanking_custom"
    pollInterval = 60
    url = "https://vcs.cnsga.aws.prod.au.internal.cba/CBA/cba-a-dch-openbanking_custom.git"
    branch = "develop"
    branchSpec = "+:refs/heads/(develop)"
    authMethod = password {
        userName = "acoe_cnsfs_githubtc"
        password = "zxx170b6439787381240e7d0e5cc79ed1a8775d03cbe80d301b"
    }
})
