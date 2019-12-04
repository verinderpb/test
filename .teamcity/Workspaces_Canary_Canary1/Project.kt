package Workspaces_Canary_Canary1

import Workspaces_Canary_Canary1.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "6c659187-200d-4d0a-9dba-b72c4f6a1792"
    extId = "Workspaces_Canary_Canary1"
    parentId = "Workspaces_Canary"
    name = "Canary1"
    description = "Pipelines for the Consumable Services"

    buildType(Workspaces_Canary_CbaANp0780169isNpdCanaryMgmt)
    buildType(Canary_CbaACl0737280isTstCanaryDemo)
    buildType(Canary_CbaACl0783785isLabCanaryDemo2)
    buildType(Workspaces_Canary_CbaACl0779879isLabCanaryMgmt)
    buildTypesOrder = arrayListOf(Workspaces_Canary_Canary1.buildTypes.Workspaces_Canary_CbaANp0780169isNpdCanaryMgmt, Workspaces_Canary_Canary1.buildTypes.Canary_CbaACl0737280isTstCanaryDemo, Workspaces_Canary_Canary1.buildTypes.Workspaces_Canary_CbaACl0779879isLabCanaryMgmt, Workspaces_Canary_Canary1.buildTypes.Canary_CbaACl0783785isLabCanaryDemo2)
})
