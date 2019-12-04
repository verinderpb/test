package Workspaces_Ga_Clab_CbaACl0881925achLabCommseeLab

import Workspaces_Ga_Clab_CbaACl0881925achLabCommseeLab.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "2215e951-9eab-49ce-bc68-64fa4adf9081"
    extId = "Workspaces_Ga_Clab_CbaACl0881925achLabCommseeLab"
    parentId = "Workspaces_Ga_Clab"
    name = "cba-a-cl-0881925-ach-lab-commsee_lab"

    buildType(Workspaces_Ga_Clab_CbaACl0881925achLabCommseeLab_CbaACl0881925achLabCommseeLabCu)
    buildType(Workspaces_Ga_Clab_CbaACl0881925achLabCommseeLab_CbaACl0881925achLabCommseeLab)
})
