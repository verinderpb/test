package Workspaces_Preview_Test_CbaACl0737249isTstPreviewTest_Tests.buildTypes

import Workspaces_Preview_Test_CbaACl0737249isTstPreviewTest.buildTypes.Workspaces_Preview_Test_CbaACl0737249isTstPreviewTest_CbaACl0737249isTstPreviewT
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.FinishBuildTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.FinishBuildTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.finishBuildTrigger

object Workspaces_Preview_Test_CbaACl0737249isTstPreviewTest_Tests_Bvt : BuildType({
    template(Workspaces.buildTypes.Workspaces_BuildVerificationTesting)
    uuid = "b6e39f20-030a-4d66-b5bc-06aef56556d6"
    extId = "Workspaces_Preview_Test_CbaACl0737249isTstPreviewTest_Tests_Bvt"
    name = "bvt"

    vcs {
        root(Workspaces_Preview_Test_CbaACl0737249isTstPreviewTest.vcsRoots.Workspaces_Preview_Test_CbaACl0737249isTstPreviewTest_CbaACl0737249isTstPrevie_3)

    }

    triggers {
        finishBuildTrigger {
            id = "TRIGGER_105"
            buildTypeExtId = Workspaces_Preview_Test_CbaACl0737249isTstPreviewTest_CbaACl0737249isTstPreviewT.extId
            branchFilter = "+:*"
        }
    }
})
