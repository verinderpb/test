package Workspaces_Ga_Prod_CbaAPr0821500deaPrdAppinfraMgmt

import Workspaces_Ga_Prod_CbaAPr0821500deaPrdAppinfraMgmt.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "2239bfeb-af67-4ea5-8064-9a1e8d6df70f"
    extId = "Workspaces_Ga_Prod_CbaAPr0821500deaPrdAppinfraMgmt"
    parentId = "Workspaces_Ga_Prod"
    name = "cba-a-pr-0821500-dea-prd-appinfra_mgmt"

    buildType(Workspaces_Ga_Prod_CbaAPr0821500deaPrdAppinfraMgmt_CbaAPr0821500deaPrdAppinfraMg)
    buildType(TenantWorkspaces_Ga_CbaAPr0821500deaPrdAppinfraMgmt)

    params {
        param("custom-repo-name", "cba-a-pr-0821500-dea-prd-appinfra_mgmt")
        param("workspace-repo-name", "cba-a-dea-appinfra-mgmt_custom")
    }
    buildTypesOrder = arrayListOf(Workspaces_Ga_Prod_CbaAPr0821500deaPrdAppinfraMgmt.buildTypes.TenantWorkspaces_Ga_CbaAPr0821500deaPrdAppinfraMgmt)
})
