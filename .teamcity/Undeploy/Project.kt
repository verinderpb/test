package Undeploy

import Undeploy.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "f1d7fc67-6262-4c5d-898d-88103d12fb78"
    extId = "Undeploy"
    parentId = "Workspaces"
    name = "Undeploy"
    description = "Undeploy an account"

    buildType(BuildType_Undeploy)
    buildType(Undeploy_CleanTenant)

    template(Undeploy_TestTemplate)
})
