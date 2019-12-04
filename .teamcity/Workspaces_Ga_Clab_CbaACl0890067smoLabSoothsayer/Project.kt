package Workspaces_Ga_Clab_CbaACl0890067smoLabSoothsayer

import Workspaces_Ga_Clab_CbaACl0890067smoLabSoothsayer.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "1a20aeb4-fcb3-4521-be27-4a76385deec3"
    extId = "Workspaces_Ga_Clab_CbaACl0890067smoLabSoothsayer"
    parentId = "Workspaces_Ga_Clab"
    name = "cba-a-cl-0890067-smo-lab-soothsayer"

    buildType(Workspaces_Ga_Clab_CbaACl0890067smoLabSoothsayer_CbaACl0890067smoLabSoothsayer)
    buildType(Workspaces_Ga_Clab_CbaACl0890067smoLabSoothsayer_CbaACl0890067smoLabSoothsayerCu)
})
