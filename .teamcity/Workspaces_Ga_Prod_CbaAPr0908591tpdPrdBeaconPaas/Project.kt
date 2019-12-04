package Workspaces_Ga_Prod_CbaAPr0908591tpdPrdBeaconPaas

import Workspaces_Ga_Prod_CbaAPr0908591tpdPrdBeaconPaas.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "e7ef97e9-9cba-4d7d-832c-6c4e4e6e063c"
    extId = "Workspaces_Ga_Prod_CbaAPr0908591tpdPrdBeaconPaas"
    parentId = "Workspaces_Ga_Prod"
    name = "cba-a-pr-0908591-tpd-prd-beacon_paas"

    buildType(Workspaces_Ga_Prod_CbaAPr0908591tpdPrdBeaconPaas_CbaAPr0908591tpdPrdBeaconPaasCu)
    buildType(Workspaces_Ga_Prod_CbaAPr0908591tpdPrdBeaconPaas_CbaAPr0908591tpdPrdBeaconPaas)
})
