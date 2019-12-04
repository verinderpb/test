package Workspaces_Ga_Clab_CbaACl0741217ibamPocMurex

import Workspaces_Ga_Clab_CbaACl0741217ibamPocMurex.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "20be638e-d806-4e67-9c82-eb91c283e58a"
    extId = "Workspaces_Ga_Clab_CbaACl0741217ibamPocMurex"
    parentId = "Workspaces_Ga_Clab"
    name = "cba-a-cl-0741217-ibam-poc-murex"

    buildType(TenantWorkspaces_CbaACl0741217ibamPocMurex)
})
