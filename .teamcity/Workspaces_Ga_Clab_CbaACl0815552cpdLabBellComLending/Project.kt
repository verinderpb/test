package Workspaces_Ga_Clab_CbaACl0815552cpdLabBellComLending

import Workspaces_Ga_Clab_CbaACl0815552cpdLabBellComLending.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "1b7803b1-bbee-4e14-848e-45b536c277dd"
    extId = "Workspaces_Ga_Clab_CbaACl0815552cpdLabBellComLending"
    parentId = "Workspaces_Ga_Clab"
    name = "cba-a-cl-0815552-cpd-lab-bell_com_lending"

    buildType(TenantWorkspaces_Ga_CbaACl0815552cpdLabBellComLending)
})
