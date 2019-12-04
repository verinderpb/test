package Workspaces_Preview_Test_CbaANp0838392isSitPreviewTest_Tests.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Workspaces_Preview_Test_CbaANp0838392isSitPreviewTest_Tests_Bvt : BuildType({
    template(Workspaces.buildTypes.Workspaces_BuildVerificationTesting)
    uuid = "25e2b0b5-d9ed-48a8-8304-e407ac898733"
    extId = "Workspaces_Preview_Test_CbaANp0838392isSitPreviewTest_Tests_Bvt"
    name = "bvt"

    vcs {
        root(Workspaces_Preview_Test_CbaANp0838392isSitPreviewTest.vcsRoots.Workspaces_Preview_Test_CbaANp0838392isSitPreviewTest_CbaANp0838392isSitPreviewT)

    }
})
