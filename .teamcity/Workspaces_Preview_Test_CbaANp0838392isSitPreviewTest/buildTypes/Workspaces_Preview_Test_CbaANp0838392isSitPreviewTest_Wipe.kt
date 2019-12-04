package Workspaces_Preview_Test_CbaANp0838392isSitPreviewTest.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Workspaces_Preview_Test_CbaANp0838392isSitPreviewTest_Wipe : BuildType({
    template(Workspaces.buildTypes.Workspaces_Wipe)
    uuid = "ab534183-b90d-44a4-8b76-6aad90fef86f"
    extId = "Workspaces_Preview_Test_CbaANp0838392isSitPreviewTest_Wipe"
    name = "wipe"

    vcs {
        root(Workspaces_Preview_Test_CbaANp0838392isSitPreviewTest.vcsRoots.Workspaces_Preview_Test_CbaANp0838392isSitPreviewTest_CbaANp0838392isSitPreviewT, "+:. => ./workspace")

    }
})
