package Workspaces_Ga_Clab_CbaACl0906235othLabAchsapcrm

import Workspaces_Ga_Clab_CbaACl0906235othLabAchsapcrm.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "b8c504fa-3b3e-4507-bec5-092a62273f6f"
    extId = "Workspaces_Ga_Clab_CbaACl0906235othLabAchsapcrm"
    parentId = "Workspaces_Ga_Clab"
    name = "cba-a-cl-0906235-oth-lab-achsapcrm"

    buildType(Workspaces_Ga_Clab_CbaACl0906235othLabAchsapcrm_CbaACl0906235othLabAchsapcrm)
    buildType(Workspaces_Ga_Clab_CbaACl0906235othLabAchsapcrm_CbaACl0906235othLabAchsapcrmCust)
})
