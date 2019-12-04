package Workspaces_Ga_Prod_CbaAPr0811334cpdPpdAnalytics

import Workspaces_Ga_Prod_CbaAPr0811334cpdPpdAnalytics.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "794043de-6d3d-426a-9bcb-a0d584a216a4"
    extId = "Workspaces_Ga_Prod_CbaAPr0811334cpdPpdAnalytics"
    parentId = "Workspaces_Ga_Prod"
    name = "cba-a-pr-0811334-cpd-ppd-analytics"

    buildType(TenantWorkspaces_Ga_CbaACpdPpdAnalyticsCustom)
    buildType(TenantWorkspaces_Ga_CbaAPr0811334cpdPpdAnalytics)
})
