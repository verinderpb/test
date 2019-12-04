package Workspaces_Ga_Prod_CbaAPr0816565dwpPrdJamf.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.CommitStatusPublisher
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.CommitStatusPublisher.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.commitStatusPublisher
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object TenantWorkspaces_Ga_CustomRepos_CbaAPr0816565dwpPrdJamf : BuildType({
    uuid = "a138b05a-b78a-4247-ac7e-33a240f565d4"
    extId = "TenantWorkspaces_Ga_CustomRepos_CbaAPr0816565dwpPrdJamf"
    name = "cba-a-pr-0816565-dwp-prd-jamf_custom"
    description = "JAMF non prod custom playbook"

    params {
        param("build.vcs.number", "%env.BUILD_VCS_NUMBER_TenantWorkspaces_Ga_CustomRepos_HttpsVcsCnsgaAwsProdAuInternalCbaCbaCbaACsecTr_2%")
        param("env.BUILD_VCS_NUMBER_TenantWorkspaces_Ga_CustomRepos_HttpsVcsCnsgaAwsProdAuInternalCbaCbaCbaACsecTr_2", "")
        param("env.NO_PROXY", "vcs.cnsga.aws.prod.au.internal.cba,169.254.169.254")
        param("env.PROXY_ADDRESS", "app-proxy.cnsga.aws.prod.au.internal.cba")
        param("env.PROXY_PORT", "3128")
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
        root("TenantWorkspaces_Ga_CustomRepos_CbaADwpJamfCustom1", "+:.=>custom")
        root("TenantWorkspaces_Ga_CbaAPr0816565dwpPrdJamf")

    }

    steps {
        script {
            name = "Run Playbook"
            scriptContent = """
                export no_proxy="${'$'}{NO_PROXY}"
                export HTTPS_PROXY=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                export HTTP_PROXY=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                export https_proxy=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                export http_proxy=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                
                ./launch.sh custom
            """.trimIndent()
        }
    }

    triggers {
        vcs {
            triggerRules = "+:root=TenantWorkspaces_Ga_CustomRepos_HttpsVcsCnsgaAwsProdAuInternalCbaCbaCbaACsecTr_2:**"
            branchFilter = "+:<default>"
        }
    }

    features {
        commitStatusPublisher {
            enabled = false
            publisher = github {
                githubUrl = "https://vcs.cnsga.aws.prod.au.internal.cba/api/v3"
                authType = personalToken {
                    token = "zxxa5a97c83b4cbf9967b0d2e42b4115d80f4fcc81542729bfbd76255bedfbcabeb0e59c4fe0a1dbe47775d03cbe80d301b"
                }
            }
        }
    }

    requirements {
        startsWith("cloud.amazon.agent-name-prefix", "cns-ga-prod-oc-mgmt-TEAMCITY-AGENT")
    }
})
