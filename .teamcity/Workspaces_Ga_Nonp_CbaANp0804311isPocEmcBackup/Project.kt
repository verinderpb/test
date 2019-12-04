package Workspaces_Ga_Nonp_CbaANp0804311isPocEmcBackup

import Workspaces_Ga_Nonp_CbaANp0804311isPocEmcBackup.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "9680c21e-9b5b-4540-aa89-8763624b576a"
    extId = "Workspaces_Ga_Nonp_CbaANp0804311isPocEmcBackup"
    parentId = "Workspaces_Ga_Nonp"
    name = "cba-a-np-0804311-is-poc-emc_backup"

    buildType(TenantWorkspaces_Ga_CbaANp0804311isPocEmcBackup)
})
