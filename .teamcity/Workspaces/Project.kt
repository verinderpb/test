package Workspaces

import Workspaces.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "54bcff6f-b5ab-451e-b944-b648102f1fa5"
    extId = "Workspaces"
    parentId = "_Root"
    name = "Workspaces"
    description = "Latest generation of workspace building jobs"

    template(Workspaces_BuildVerificationTesting)
    template(Workspaces_CuratorTestingUat)
    template(Workspaces_Wipe)
    template(Workspaces_Custom)
    template(Workspaces_CustomerTesting)
    template(Workspaces_Workspace)

    params {
        param("build.vcs.number", "")
        password("env.TC_PASS", "zxx170b643978738124a5c11058131802530e605d981873c6fe")
        param("env.TC_USER", "acoe_cnsfs_githubtc")
    }
})
