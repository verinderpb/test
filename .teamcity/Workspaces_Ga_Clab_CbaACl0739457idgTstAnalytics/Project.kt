package Workspaces_Ga_Clab_CbaACl0739457idgTstAnalytics

import Workspaces_Ga_Clab_CbaACl0739457idgTstAnalytics.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "e90eb52c-e557-44b9-8ed0-d8f054016418"
    extId = "Workspaces_Ga_Clab_CbaACl0739457idgTstAnalytics"
    parentId = "Workspaces_Ga_Clab"
    name = "cba-a-cl-0739457-idg-tst-analytics"

    buildType(TenantWorkspaces_Ga_CbaACl0739457idgTstAnalytics)
})
