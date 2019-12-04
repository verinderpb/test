package Workspaces_Ga_Clab_CbaACl1234567ocTestDellammi

import Workspaces_Ga_Clab_CbaACl1234567ocTestDellammi.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "9d0ea8bf-a515-4895-bc9d-5d4a6dfb8a96"
    extId = "Workspaces_Ga_Clab_CbaACl1234567ocTestDellammi"
    parentId = "Workspaces_Ga_Clab"
    name = "cba-a-cl-1234567-oc-test-dellammi"

    buildType(Workspaces_Ga_Clab_CbaACl1234567ocTestDellammi_CbaACl1234567ocTestDellammiCustom)
    buildType(Workspaces_Ga_Clab_CbaACl1234567ocTestDellammi_CbaACl1234567ocTestDellammi)
})
