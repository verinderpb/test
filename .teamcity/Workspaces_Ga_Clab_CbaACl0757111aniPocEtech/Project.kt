package Workspaces_Ga_Clab_CbaACl0757111aniPocEtech

import Workspaces_Ga_Clab_CbaACl0757111aniPocEtech.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "ed3ad123-c569-4e07-bdbf-0809747ca26e"
    extId = "Workspaces_Ga_Clab_CbaACl0757111aniPocEtech"
    parentId = "Workspaces_Ga_Clab"
    name = "cba-a-cl-0757111-ani-poc-etech"

    buildType(TenantWorkspaces_CbaACl0757111aniPocEtech)
})
