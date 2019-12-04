package Workspaces_Ga_Clab_CbaACl0741219deaPocGaAppinfra

import Workspaces_Ga_Clab_CbaACl0741219deaPocGaAppinfra.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "d7fac721-442c-42db-a5b8-6381c38875e5"
    extId = "Workspaces_Ga_Clab_CbaACl0741219deaPocGaAppinfra"
    parentId = "Workspaces_Ga_Clab"
    name = "cba-a-cl-0741219-dea-poc-ga_appinfra"

    buildType(TenantWorkspaces_CbaACl0741219deaPocGaAppinfra)
})
