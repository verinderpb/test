package Workspaces_Preview_Test_CbaACl0838394isLabPreviewTest_Tests.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Workspaces_Preview_Test_CbaACl0838394isLabPreviewTest_Tests_Bvt : BuildType({
    template(Workspaces.buildTypes.Workspaces_BuildVerificationTesting)
    uuid = "026fd610-cae6-4dcd-b54f-de724397ce13"
    extId = "Workspaces_Preview_Test_CbaACl0838394isLabPreviewTest_Tests_Bvt"
    name = "bvt"

    params {
        param("env.BVT_USERSTORE_ROLE", "arn:aws:iam::478486143655:role/preview-nonp-is-oc-users-IAM-ROL-PlatformBuildRole-ICW0CIKAZTHP")
    }

    vcs {
        root("CbaACl0838394isLabPreviewTest")

    }
})
