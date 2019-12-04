package Workspaces_Ga_Nonp_CbaANp0828109deaNpdAppinfraClusterLin

import Workspaces_Ga_Nonp_CbaANp0828109deaNpdAppinfraClusterLin.buildTypes.*
import Workspaces_Ga_Nonp_CbaANp0828109deaNpdAppinfraClusterLin.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "f026cf6f-78df-4048-b4d0-f95afd58f414"
    extId = "Workspaces_Ga_Nonp_CbaANp0828109deaNpdAppinfraClusterLin"
    parentId = "Workspaces_Ga_Nonp"
    name = "cba-a-np-0828109-dea-npd-appinfra_cluster_lin"

    vcsRoot(Workspaces_Ga_Nonp_CbaANp0828109deaNpdAppinfraClusterLin_TestCnsRepo)

    buildType(Workspaces_Ga_Nonp_CbaANp0828109deaNpdAppinfraClusterLin_CbaANp0828109deaNpdAppi)
    buildType(Workspaces_Ga_Nonp_CbaANp0828109deaNpdAppinfraClusterLin_CbaANp0828109deaNpdAp_2)
})
