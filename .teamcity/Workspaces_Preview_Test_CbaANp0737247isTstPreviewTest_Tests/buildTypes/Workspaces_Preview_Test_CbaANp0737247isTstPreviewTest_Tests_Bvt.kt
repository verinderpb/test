package Workspaces_Preview_Test_CbaANp0737247isTstPreviewTest_Tests.buildTypes

import Workspaces_Preview_Test_CbaANp0737247isTstPreviewTest.buildTypes.Workspaces_Preview_Test_CbaANp0737247isTstPreviewTest_CbaANp0737247isTstPreviewT
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.FinishBuildTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.FinishBuildTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.finishBuildTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object Workspaces_Preview_Test_CbaANp0737247isTstPreviewTest_Tests_Bvt : BuildType({
    template(Workspaces.buildTypes.Workspaces_BuildVerificationTesting)
    uuid = "2cd528f0-58d6-4f0a-a0fb-8ab9f5c8af91"
    extId = "Workspaces_Preview_Test_CbaANp0737247isTstPreviewTest_Tests_Bvt"
    name = "bvt"

    maxRunningBuilds = 1

    vcs {
        root("Workspaces_Preview_Test_CbaANp0737247isTstPreviewTest_CbaANp0737247isTstPreviewT")

    }

    triggers {
        vcs {
            id = "vcsTrigger"
        }
        finishBuildTrigger {
            id = "TRIGGER_118"
            buildTypeExtId = Workspaces_Preview_Test_CbaANp0737247isTstPreviewTest_CbaANp0737247isTstPreviewT.extId
            successfulOnly = true
            branchFilter = "+:*"
        }
    }
})
