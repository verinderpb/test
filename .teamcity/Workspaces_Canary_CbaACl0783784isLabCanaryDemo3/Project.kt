package Workspaces_Canary_CbaACl0783784isLabCanaryDemo3

import Workspaces_Canary_CbaACl0783784isLabCanaryDemo3.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "7ef866a3-f450-4c5e-ac03-bb580e2a613f"
    extId = "Workspaces_Canary_CbaACl0783784isLabCanaryDemo3"
    parentId = "Workspaces_Canary_Canary1"
    name = "ad-hoc"

    buildType(Canary_CbaACl0737264isTstCanaryPlatform)

    params {
        param("env.branch_name", "master")
        param("env.workspace_repo_name", "%reverse.dep.*.workspace_repo_name%")
        param("reverse.dep.*.workspace_repo_name", "cba-a-cl-0783784-is-lab-canary_demo3")
    }
    buildTypesOrder = arrayListOf(Workspaces_Canary_CbaACl0783784isLabCanaryDemo3.buildTypes.Canary_CbaACl0737264isTstCanaryPlatform)
})
