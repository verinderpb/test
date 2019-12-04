package Workspaces_Preview_Test_CbaANp0737247isTstPreviewTest.buildTypes

import Workspaces_Preview_Mgmt_CbaANp0737259isTstPreviewMgmt.buildTypes.FoundationWorkspaces_CbaANp0737259isTstPreviewMgmt
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.FinishBuildTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.FinishBuildTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.finishBuildTrigger

object Workspaces_Preview_Test_CbaANp0737247isTstPreviewTest_Wipe : BuildType({
    template(Workspaces.buildTypes.Workspaces_Wipe)
    uuid = "7f83e714-952a-4980-b283-265b16864c9a"
    extId = "Workspaces_Preview_Test_CbaANp0737247isTstPreviewTest_Wipe"
    name = "wipe"

    vcs {
        root(Workspaces_Preview_Test_CbaANp0737247isTstPreviewTest.vcsRoots.Workspaces_Preview_Test_CbaANp0737247isTstPreviewTest_CbaANp0737247isTstPrevie_2, "+:. => ./workspace")

    }

    triggers {
        finishBuildTrigger {
            id = "TRIGGER_100"
            enabled = false
            buildTypeExtId = FoundationWorkspaces_CbaANp0737259isTstPreviewMgmt.extId
            successfulOnly = true
        }
    }
})
