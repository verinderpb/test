package Workspaces_Ga_Clab_CbaACl0846690aniLabAutomlPoc

import Workspaces_Ga_Clab_CbaACl0846690aniLabAutomlPoc.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "30b28deb-9a41-4283-9092-2e3a24130163"
    extId = "Workspaces_Ga_Clab_CbaACl0846690aniLabAutomlPoc"
    parentId = "Workspaces_Ga_Clab"
    name = "cba-a-cl-0846690-ani-lab-automl_poc"

    buildType(Workspaces_Ga_Clab_CbaACl0846690aniLabAutomlPoc_CbaACl0846690aniLabAutomlPoc)
    buildType(Workspaces_Ga_Clab_CbaACl0846690aniLabAutomlPoc_CbaACl0846690aniLabAutomlPocCust)
})
