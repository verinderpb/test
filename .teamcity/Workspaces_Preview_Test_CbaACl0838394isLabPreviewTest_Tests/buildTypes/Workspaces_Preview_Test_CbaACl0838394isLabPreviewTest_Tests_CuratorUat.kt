package Workspaces_Preview_Test_CbaACl0838394isLabPreviewTest_Tests.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Workspaces_Preview_Test_CbaACl0838394isLabPreviewTest_Tests_CuratorUat : BuildType({
    template(Workspaces.buildTypes.Workspaces_CuratorTestingUat)
    uuid = "62073daf-0adb-45e8-bbb9-ca6b150ca6ba"
    extId = "Workspaces_Preview_Test_CbaACl0838394isLabPreviewTest_Tests_CuratorUat"
    name = "curator-uat"
    description = "Runs Curator UAT"

    artifactRules = """
        report.xml
        report.html
    """.trimIndent()

    vcs {
        root("CbaACl0838394isLabPreviewTest")

    }
})
