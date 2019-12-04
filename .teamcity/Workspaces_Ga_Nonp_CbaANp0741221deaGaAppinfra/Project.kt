package Workspaces_Ga_Nonp_CbaANp0741221deaGaAppinfra

import Workspaces_Ga_Nonp_CbaANp0741221deaGaAppinfra.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "913e090d-e601-4f79-8233-bf1457195cd4"
    extId = "Workspaces_Ga_Nonp_CbaANp0741221deaGaAppinfra"
    parentId = "Workspaces_Ga_Nonp"
    name = "cba-a-np-0741221-dea-ga_appinfra"

    buildType(TenantWorkspaces_CbaANp0741221deaGaAppinfra)
    buildType(TenantWorkspaces_Ga_CustomRepos_CbaANp0741221deaGaAppinfraCustom)
})
