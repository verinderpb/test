package Workspaces_Canary_CbaACl0783784isLabCanaryDemo3.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.CommitStatusPublisher
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.CommitStatusPublisher.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.commitStatusPublisher
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object Canary_CbaACl0737264isTstCanaryPlatform : BuildType({
    uuid = "4b22d5fd-d96b-40d6-b3e4-c1f7a9bf7356"
    extId = "Canary_CbaACl0737264isTstCanaryPlatform"
    name = "cba-a-cl-0737264-is-tst-canary_platform"
    description = "Canary Platform Workspace"


    params {
        param("env.NO_PROXY", "vcs.cnsga.aws.prod.au.internal.cba")
        param("env.PROXY_ADDRESS", "app-proxy.cnsga.aws.prod.au.internal.cba")
        param("env.PROXY_PORT", "3128")
        param("env.TC_PASS", "zxx170b643978738124a5c11058131802530e605d981873c6fe")
        param("env.TC_USER", "acoe_cnsfs_githubtc")
    }

    vcs {
        root("Canary_CbaACl0737264isTstCanaryPlatformGit")

        checkoutMode = CheckoutMode.ON_AGENT
        cleanCheckout = true
    }

    steps {
        script {
            name = "Test Step"
            enabled = false
            scriptContent = """
                ls -l
                #export no_proxy="${'$'}{NO_PROXY}"
                #export HTTPS_PROXY=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                #export HTTP_PROXY=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                #export https_proxy=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                #export http_proxy=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                
                # Setup users and passwords for roles
                #sed -i "s/USER/${'$'}{TC_USER}/g" requirements.yml
                #sed -i "s/PASS/${'$'}{TC_PASS}/g" requirements.yml
                #ansible-galaxy install -c -f -p roles/ -r requirements.yml
                
                ## Validating AWS CF templates
                #for i in roles/*
                #do
                #    for j in ${'$'}i/files/*
                #    do
                #        echo "Testing ${'$'}{j}"
                #        if [[ -f ${'$'}{j} ]] && [[ ! ${'$'}(aws cloudformation validate-template --template-body file://${'$'}{j}) ]];then
                #            echo "Error in ${'$'}{j}"
                #            exit 1
                #        fi
                #    done
                #done
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

    features {
        commitStatusPublisher {
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
