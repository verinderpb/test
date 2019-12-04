package Workspaces_Ga_Nonp_CbaANp0828109deaNpdAppinfraClusterLin.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Workspaces_Ga_Nonp_CbaANp0828109deaNpdAppinfraClusterLin_TestCnsRepo : GitVcsRoot({
    uuid = "c0eeeeb0-458e-40cf-98c1-dfb901b2718d"
    extId = "Workspaces_Ga_Nonp_CbaANp0828109deaNpdAppinfraClusterLin_TestCnsRepo"
    name = "test_cns_repo"
    url = "https://vcs.cnsga.aws.prod.au.internal.cba/CNS/%env.workspace-repo-name%.git"
    authMethod = password {
        userName = "korathkk"
        password = "zxxbeaeb42eca661a7e2bc8e72c2a1a36ad6be933a1f19037dffc423a5ce03998a526679dd065367993775d03cbe80d301b"
    }
})
