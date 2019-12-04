package Workspaces_Ga_Nonp_CbaANp0820197dchNpdApiGateway.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Workspaces_Ga_Nonp_CbaANp0820197dchNpdApiGateway_CustomRepoRoot : GitVcsRoot({
    uuid = "235d1476-b980-45db-8915-f321fde54672"
    extId = "Workspaces_Ga_Nonp_CbaANp0820197dchNpdApiGateway_CustomRepoRoot"
    name = "https://vcs.cnsga.aws.prod.au.internal.cba/CBA/cba-a-dch-openbanking_custom.git"
    pollInterval = 60
    url = "https://vcs.cnsga.aws.prod.au.internal.cba/CBA/cba-a-dch-openbanking_custom.git"
    branch = "develop"
    branchSpec = "+:refs/heads/develop"
    authMethod = password {
        userName = "acoe_cnsfs_githubtc"
        password = "zxx170b6439787381240e7d0e5cc79ed1a8775d03cbe80d301b"
    }
})
