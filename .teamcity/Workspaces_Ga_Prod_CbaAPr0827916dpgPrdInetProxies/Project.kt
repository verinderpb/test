package Workspaces_Ga_Prod_CbaAPr0827916dpgPrdInetProxies

import Workspaces_Ga_Prod_CbaAPr0827916dpgPrdInetProxies.buildTypes.*
import Workspaces_Ga_Prod_CbaAPr0827916dpgPrdInetProxies.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "1872c919-0d39-4cc0-a13e-74cb38eb0699"
    extId = "Workspaces_Ga_Prod_CbaAPr0827916dpgPrdInetProxies"
    parentId = "Workspaces_Ga_Prod"
    name = "cba-a-pr-0827916-dpg-prd-inet_proxies"

    vcsRoot(Workspaces_Ga_Prod_CbaAPr0827916dpgPrdInetProxies_WorkspaceRepoRoot)

    buildType(Workspaces_Ga_Prod_CbaAPr0827916dpgPrdInetProxies_CbaAPr0827916dpgPrdInetProxies)
    buildType(Workspaces_Ga_Prod_CbaAPr0827916dpgPrdInetProxies_CbaAPr0827916dpgPrdInetProxi_2)
})
