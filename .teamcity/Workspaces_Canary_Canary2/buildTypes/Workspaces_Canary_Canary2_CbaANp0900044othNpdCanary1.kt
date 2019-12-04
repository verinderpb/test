package Workspaces_Canary_Canary2.buildTypes

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

object Workspaces_Canary_Canary2_CbaANp0900044othNpdCanary1 : BuildType({
    uuid = "330c196c-bbd6-4f11-99c5-e6c9bd17c23c"
    extId = "Workspaces_Canary_Canary2_CbaANp0900044othNpdCanary1"
    name = "cba-a-np-0900044-oth-npd-canary_1"
    description = "Canary2 Nonp Mgmt"

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
        param("env.TC_ProjectName", "%system.teamcity.projectName%")
        param("env.TC_Version", "%system.teamcity.version%")
    }

    vcs {
        root(Workspaces_Canary_Canary2.vcsRoots.Vcs_Workspaces_Canary_Canary2_CbaANp0900044othNpdCanary1)

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
                
                #./update_versions.py
                #cat requirements.yml
                
                ./launch.sh
            """.trimIndent()
        }
    }

    triggers {
        vcs {
            enabled = false
            branchFilter = """
                +:*
                -:<default>
            """.trimIndent()
        }
    }

    features {
        commitStatusPublisher {
            publisher = github {
                githubUrl = "https://vcs.cnsga.aws.prod.au.internal.cba/api/v3/"
                authType = password {
                    userName = "acoe_cnsfs_githubtc"
                    password = "zxx59a101063d2c9c585dd657b8cdbbf474e46cc21fd5e5c4c35830598cf19b055ac3a9bfbc6efde453775d03cbe80d301b"
                }
            }
            param("secure:github_access_token", "zxxa5a97c83b4cbf9967b0d2e42b4115d80f4fcc81542729bfbd76255bedfbcabeb0e59c4fe0a1dbe47775d03cbe80d301b")
        }
    }

    requirements {
        startsWith("cloud.amazon.agent-name-prefix", "cns-ga-prod-oc-mgmt")
        endsWith("cloud.amazon.agent-name-prefix", "TEAMCITY-AGENT")
    }
})
