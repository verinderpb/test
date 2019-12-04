package Workspaces_Ga_Clab_CbaACl0760351deaTstGaSvc

import Workspaces_Ga_Clab_CbaACl0760351deaTstGaSvc.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "03167181-404b-4be3-a27f-76dff5f26821"
    extId = "Workspaces_Ga_Clab_CbaACl0760351deaTstGaSvc"
    parentId = "Workspaces_Ga_Clab"
    name = "cba-a-cl-0760351-dea-tst-ga_svc"

    buildType(TenantWorkspaces_CbaACl0760351deaTstGaSvc)
})
