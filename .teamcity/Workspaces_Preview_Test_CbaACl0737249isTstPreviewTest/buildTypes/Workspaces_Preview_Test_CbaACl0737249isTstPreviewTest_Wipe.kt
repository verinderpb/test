package Workspaces_Preview_Test_CbaACl0737249isTstPreviewTest.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Workspaces_Preview_Test_CbaACl0737249isTstPreviewTest_Wipe : BuildType({
    template(Workspaces.buildTypes.Workspaces_Wipe)
    uuid = "b451a41f-f361-405d-a0a6-00bf63954e18"
    extId = "Workspaces_Preview_Test_CbaACl0737249isTstPreviewTest_Wipe"
    name = "wipe"

    artifactRules = """
        inventory.log
        **/wiping.log
    """.trimIndent()
    maxRunningBuilds = 1

    vcs {
        root("Workspaces_Preview_Test_CbaACl0737249isTstPreviewTest_CbaACl0737249isTstPrevie_2", "+:. => ./workspace")

    }
})
