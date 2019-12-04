package Workspaces_Ga_Prod_CbaAPr0821501deaPrdAppinfraClusterLin

import Workspaces_Ga_Prod_CbaAPr0821501deaPrdAppinfraClusterLin.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "d8b70a60-b14f-42b4-a40d-867523e11084"
    extId = "Workspaces_Ga_Prod_CbaAPr0821501deaPrdAppinfraClusterLin"
    parentId = "Workspaces_Ga_Prod"
    name = "cba-a-pr-0821501-dea-prd-appinfra_cluster_lin"

    buildType(Workspaces_Ga_Prod_CbaAPr0821501deaPrdAppinfraClusterLin_CbaAPr0821501deaPrdAppi)
    buildType(Workspaces_Ga_Prod_CbaAPr0821501deaPrdAppinfraClusterLin_CbaAPr0821501deaPrdAp_2)
})
