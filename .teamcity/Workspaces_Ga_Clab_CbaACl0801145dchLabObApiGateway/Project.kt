package Workspaces_Ga_Clab_CbaACl0801145dchLabObApiGateway

import Workspaces_Ga_Clab_CbaACl0801145dchLabObApiGateway.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "a213b7f8-7e31-48e4-a0a2-de25b9dd42a4"
    extId = "Workspaces_Ga_Clab_CbaACl0801145dchLabObApiGateway"
    parentId = "Workspaces_Ga_Clab"
    name = "cba-a-cl-0801145-dch-lab-ob_api_gateway"

    buildType(TenantWorkspaces_Ga_CbaACl0801145dchLabObApiGateway)
})
