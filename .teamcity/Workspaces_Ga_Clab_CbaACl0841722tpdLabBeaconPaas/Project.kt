package Workspaces_Ga_Clab_CbaACl0841722tpdLabBeaconPaas

import Workspaces_Ga_Clab_CbaACl0841722tpdLabBeaconPaas.buildTypes.*
import Workspaces_Ga_Clab_CbaACl0841722tpdLabBeaconPaas.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "ac1604a9-5e23-46e9-b80b-33ff28ad9a5c"
    extId = "Workspaces_Ga_Clab_CbaACl0841722tpdLabBeaconPaas"
    parentId = "Workspaces_Ga_Clab"
    name = "cba-a-cl-0841722-tpd-lab-beacon_paas"

    vcsRoot(Workspaces_Ga_Clab_CbaACl0841722tpdLabBeaconPaas_CustomRepoRoot)

    buildType(Workspaces_Ga_Clab_CbaACl0841722tpdLabBeaconPaas_CbaACl0841722tpdLabBeaconPaas)
    buildType(Workspaces_Ga_Clab_CbaACl0841722tpdLabBeaconPaas_CbaACl0841722tpdLabBeaconPaasCu)
})
