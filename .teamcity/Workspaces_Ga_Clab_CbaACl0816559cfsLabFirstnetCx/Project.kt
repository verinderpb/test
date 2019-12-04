package Workspaces_Ga_Clab_CbaACl0816559cfsLabFirstnetCx

import Workspaces_Ga_Clab_CbaACl0816559cfsLabFirstnetCx.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "8c543ba2-dbf3-4cd4-9f9a-ffe3557d3ebc"
    extId = "Workspaces_Ga_Clab_CbaACl0816559cfsLabFirstnetCx"
    parentId = "Workspaces_Ga_Clab"
    name = "cba-a-cl-0816559-cfs-lab-firstnet_cx"

    buildType(Workspaces_Ga_Clab_CbaACl0816559cfsLabFirstnetCx_CbaACl0816559cfsLabFirstnetCxCu)
    buildType(TenantWorkspaces_Ga_CbaACl0816559cfsLabFirstnetCx)
})
