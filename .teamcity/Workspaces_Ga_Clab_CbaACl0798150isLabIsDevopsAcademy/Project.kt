package Workspaces_Ga_Clab_CbaACl0798150isLabIsDevopsAcademy

import Workspaces_Ga_Clab_CbaACl0798150isLabIsDevopsAcademy.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "58b897a8-0711-4fcc-b1a2-4b3401308eb0"
    extId = "Workspaces_Ga_Clab_CbaACl0798150isLabIsDevopsAcademy"
    parentId = "Workspaces_Ga_Clab"
    name = "cba-a-cl-0798150-is-lab-is_devops_academy"

    buildType(TenantWorkspaces_Ga_CbaACl0798150isLabIsDevopsAcademy)
})
