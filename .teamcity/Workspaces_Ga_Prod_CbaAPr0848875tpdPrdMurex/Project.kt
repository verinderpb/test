package Workspaces_Ga_Prod_CbaAPr0848875tpdPrdMurex

import Workspaces_Ga_Prod_CbaAPr0848875tpdPrdMurex.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "dc12de6d-9586-4900-a907-6b99bfef7e4c"
    extId = "Workspaces_Ga_Prod_CbaAPr0848875tpdPrdMurex"
    parentId = "Workspaces_Ga_Prod"
    name = "cba-a-pr-0848875-tpd-prd-murex"

    buildType(Workspaces_Ga_Prod_CbaAPr0848875tpdPrdMurex_CbaAPr0848875tpdPrdMurex)
    buildType(Workspaces_Ga_Prod_CbaAPr0848875tpdPrdMurex_CbaAPr0848875tpdPrdMurexCustom)
})
