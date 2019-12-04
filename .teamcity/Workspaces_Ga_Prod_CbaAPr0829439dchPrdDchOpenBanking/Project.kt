package Workspaces_Ga_Prod_CbaAPr0829439dchPrdDchOpenBanking

import Workspaces_Ga_Prod_CbaAPr0829439dchPrdDchOpenBanking.buildTypes.*
import Workspaces_Ga_Prod_CbaAPr0829439dchPrdDchOpenBanking.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "ce28bc95-c6ac-4aeb-aa1b-174c8362f219"
    extId = "Workspaces_Ga_Prod_CbaAPr0829439dchPrdDchOpenBanking"
    parentId = "Workspaces_Ga_Prod"
    name = "cba-a-pr-0829439-dch-prd-dch_open_banking"

    vcsRoot(Workspaces_Ga_Prod_CbaAPr0829439dchPrdDchOpenBanking_WorkspaceRepoRoot)

    buildType(Workspaces_Ga_Prod_CbaAPr0829439dchPrdDchOpenBanking_CbaAPr0829439dchPrdDchOpe_2)
    buildType(Workspaces_Ga_Prod_CbaAPr0829439dchPrdDchOpenBanking_CbaAPr0829439dchPrdDchOpenB)
})
