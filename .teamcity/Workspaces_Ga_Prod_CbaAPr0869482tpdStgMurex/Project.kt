package Workspaces_Ga_Prod_CbaAPr0869482tpdStgMurex

import Workspaces_Ga_Prod_CbaAPr0869482tpdStgMurex.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "53572fed-9114-4029-b2c8-d140b0f29765"
    extId = "Workspaces_Ga_Prod_CbaAPr0869482tpdStgMurex"
    parentId = "Workspaces_Ga_Prod"
    name = "cba-a-pr-0869482-tpd-stg-murex"

    buildType(Workspaces_Ga_Prod_CbaAPr0869482tpdStgMurex_CbaAPr0869482tpdStgMurex)
    buildType(Workspaces_Ga_Prod_CbaAPr0869482tpdStgMurex_CbaAPr0869482tpdStgMurexCustom)
})
