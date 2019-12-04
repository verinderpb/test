package Workspaces_Preview_Mgmt_CbaANp0737259isTstPreviewMgmt.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.CommitStatusPublisher
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.CommitStatusPublisher.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.commitStatusPublisher
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.ScheduleTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.ScheduleTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.schedule

object FoundationWorkspaces_CbaANp0737259isTstPreviewMgmt : BuildType({
    uuid = "04877f0b-8462-4748-ab70-b914c4f7ef96"
    extId = "FoundationWorkspaces_CbaANp0737259isTstPreviewMgmt"
    name = "cba-a-np-0737259-is-tst-preview_mgmt"
    description = "Preview NONP Mgmt"

    allowExternalStatus = true
    maxRunningBuilds = 1

    params {
        param("env.TC_AgentAMI", "%system.ec2.ami-id%")
        param("env.TC_AgentName", "%teamcity.agent.name%")
        param("env.TC_BuildBranch", "%teamcity.build.branch%")
        param("env.TC_BuildCommit", "%build.vcs.number%")
        param("env.TC_BuildName", "%system.teamcity.buildConfName%")
        param("env.TC_BuildNum", "%system.build.number%")
        param("env.TC_BuildUser", "%teamcity.build.triggeredBy.username%")
        param("env.TC_PASS", "zxx170b643978738124a5c11058131802530e605d981873c6fe")
        param("env.TC_ProjectName", "%system.teamcity.projectName%")
        param("env.TC_USER", "acoe_cnsfs_githubtc")
        param("env.TC_Version", "%system.teamcity.version%")
    }

    vcs {
        root("CbaANp0737259isTstPreviewMgmtGit")

        checkoutMode = CheckoutMode.ON_AGENT
        cleanCheckout = true
    }

    steps {
        script {
            name = "Test Step"
            scriptContent = """
                ls -la
                ansible --version
                
                #echo git clone -v https://vcs.cnsga.aws.prod.au.internal.cba/CNS/cba-cns-aws-ga-clab-is-oc-test-workspace.git
            """.trimIndent()
        }
        script {
            name = "Run Playbook"
            scriptContent = """
                export no_proxy="${'$'}{NO_PROXY}"
                export HTTPS_PROXY=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                export HTTP_PROXY=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                export https_proxy=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                export http_proxy=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                
                ./launch.sh
            """.trimIndent()
        }
    }

    triggers {
        schedule {
            schedulingPolicy = daily {
                hour = 5
            }
            triggerBuild = always()
            withPendingChangesOnly = false
            enforceCleanCheckout = true
            param("revisionRule", "lastFinished")
            param("branchFilter", "+:<default>")
            param("dayOfWeek", "Thursday")
        }
    }

    features {
        commitStatusPublisher {
            publisher = github {
                githubUrl = "https://vcs.cnsga.aws.prod.au.internal.cba/api/v3"
                authType = personalToken {
                    token = "zxx28f7e6ed05e1dfa605f9db70e8fbc5ce424edf9201769c1897fdc43a1f78943690c78d678fd12a30775d03cbe80d301b"
                }
            }
            param("secure:github_password", "zxxa40fd7e24e7c017da671a8f985429d21775d03cbe80d301b")
            param("github_username", "guptaa33")
        }
    }

    dependencies {
        dependency(Workspaces_Preview_Mgmt_CbaANp0879510isTstPreviewTgw.buildTypes.Workspaces_Preview_Mgmt_CbaANp0879510isTstPreviewTgw_CbaANp0879510isTstPreviewTg) {
            snapshot {
                onDependencyFailure = FailureAction.FAIL_TO_START
            }
        }
    }

    requirements {
        equals("system.ec2.local-ipv4", "10.211.130.172", "RQ_71")
        endsWith("cloud.amazon.agent-name-prefix", "TEAMCITY-AGENT")
        startsWith("cloud.amazon.agent-name-prefix", "cns-ga-prod-oc-mgmt")
    }
    
    disableSettings("RQ_71")
})
