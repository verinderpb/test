package Workspaces_Ga_Nonp_CbaANp0828111dpgStgInetProxies

import Workspaces_Ga_Nonp_CbaANp0828111dpgStgInetProxies.buildTypes.*
import Workspaces_Ga_Nonp_CbaANp0828111dpgStgInetProxies.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "e76c9ea0-1996-4d83-9158-164564cbb641"
    extId = "Workspaces_Ga_Nonp_CbaANp0828111dpgStgInetProxies"
    parentId = "Workspaces_Ga_Nonp"
    name = "cba-a-np-0828111-dpg-stg-inet_proxies"

    vcsRoot(Workspaces_Ga_Nonp_CbaANp0828111dpgStgInetProxies_WorkspaceRepoRoot)
    vcsRoot(Workspaces_Ga_Nonp_CbaANp0828111dpgStgInetProxies_CustomRepoRoot)

    buildType(TenantWorkspaces_Ga_CbaANp0828111dpgStgInetProxies)
    buildType(Workspaces_Ga_Nonp_CbaANp0828111dpgStgInetProxies_CbaANp0828111dpgStgInetProxi_2)
})
