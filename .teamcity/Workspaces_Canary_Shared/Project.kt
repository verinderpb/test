package Workspaces_Canary_Shared

import Workspaces_Canary_Shared.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "1f252fac-d53f-4a30-b44a-5a7c88b14265"
    extId = "Workspaces_Canary_Shared"
    parentId = "Workspaces_Canary"
    name = "Shared"
    description = "Pipelines shared by PUB teams"

    buildType(Canary_CbaACl0779881isLabCanaryUsers)
    buildType(Workspaces_Canary_Shared_CbaACl0737244isTstCanaryOrg)
    buildTypesOrder = arrayListOf(Workspaces_Canary_Shared.buildTypes.Canary_CbaACl0779881isLabCanaryUsers, Workspaces_Canary_Shared.buildTypes.Workspaces_Canary_Shared_CbaACl0737244isTstCanaryOrg)
})
