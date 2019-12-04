package Workspaces_Ga_Clab_CbaACl0829333aniLabDnaPega

import Workspaces_Ga_Clab_CbaACl0829333aniLabDnaPega.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "706e3a78-0253-4d63-a706-335d8c346fae"
    extId = "Workspaces_Ga_Clab_CbaACl0829333aniLabDnaPega"
    parentId = "Workspaces_Ga_Clab"
    name = "cba-a-cl-0829333-ani-lab-dna_pega"

    buildType(Workspaces_Ga_Clab_CbaACl0829333aniLabDnaPega_CbaACl0829333aniLabDnaPegaCustom)
    buildType(Workspaces_Ga_Clab_CbaACl0829333aniLabDnaPega_CbaACl0829333aniLabDnaPega)
})
