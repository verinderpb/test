package Workspaces_Ga_Clab_CbaACl0879964payLabPepDcosPoc

import Workspaces_Ga_Clab_CbaACl0879964payLabPepDcosPoc.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "d9f7ae4f-49b8-457c-8fd4-5a1a3310cd6f"
    extId = "Workspaces_Ga_Clab_CbaACl0879964payLabPepDcosPoc"
    parentId = "Workspaces_Ga_Clab"
    name = "cba-a-cl-0879964-pay-lab-pep_dcos_poc"

    buildType(Workspaces_Ga_Clab_CbaACl0879964payLabPepDcosPoc_CbaACl0879964payLabPepDcosPoc)
    buildType(Workspaces_Ga_Clab_CbaACl0879964payLabPepDcosPoc_CbaACl0879964payLabPepDcosPocCu)
})
