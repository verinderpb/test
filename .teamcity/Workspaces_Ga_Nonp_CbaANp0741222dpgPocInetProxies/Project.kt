package Workspaces_Ga_Nonp_CbaANp0741222dpgPocInetProxies

import Workspaces_Ga_Nonp_CbaANp0741222dpgPocInetProxies.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "090a1e85-7cca-494a-acce-9e940615168b"
    extId = "Workspaces_Ga_Nonp_CbaANp0741222dpgPocInetProxies"
    parentId = "Workspaces_Ga_Nonp"
    name = "cba-a-np-0741222-dpg-poc-inet_proxies"

    buildType(TenantWorkspaces_Ga_CbaANp0741222dpgPocInetProxies)
})
