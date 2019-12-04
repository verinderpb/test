package Workspaces_Ga_Prod_CbaAPr0737255isPrdGaAuditlake

import Workspaces_Ga_Prod_CbaAPr0737255isPrdGaAuditlake.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "e957b475-d26e-40ba-a9cd-7546e292b5ca"
    extId = "Workspaces_Ga_Prod_CbaAPr0737255isPrdGaAuditlake"
    parentId = "Workspaces_Ga_Prod"
    name = "cba-a-pr-0737255-is-prd-ga_auditlake"

    buildType(FoundationWorkspaces_Ga_CbaAPr0737255isPrdGaAuditlake)
})
