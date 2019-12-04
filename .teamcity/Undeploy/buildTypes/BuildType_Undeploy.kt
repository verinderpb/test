package Undeploy.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object BuildType_Undeploy : BuildType({
    uuid = "60db75e0-cd68-45d0-8fff-4fc465f3f132"
    extId = "Undeploy"
    name = "Undeploy"
    description = "Undeploy an account"

    params {
        text("env.account_to_wipe", "", description = "Account id you need to wipe out", display = ParameterDisplay.PROMPT, allowEmpty = true)
    }

    vcs {
        root("HttpsVcsCnsgaAwsProdAuInternalCbaCnsAnsibleAwsAccountWipeOutGit")

    }

    steps {
        script {
            scriptContent = """
                #!/bin/bash -x
                export no_proxy="${'$'}{NO_PROXY}"
                export HTTPS_PROXY=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                export HTTP_PROXY=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                export https_proxy=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                export http_proxy=${'$'}{PROXY_ADDRESS}:${'$'}{PROXY_PORT}
                
                ./execute.sh
            """.trimIndent()
        }
    }

    requirements {
        startsWith("cloud.amazon.agent-name-prefix", "cns-ga-prod-oc-mgmt-TEAMCITY-AGENT")
    }
})
