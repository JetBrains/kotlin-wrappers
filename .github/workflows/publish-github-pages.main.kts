#!/usr/bin/env kotlin

@file:Import("common.main.kts")

@file:Repository("https://repo.maven.apache.org/maven2/")
// work-around for https://youtrack.jetbrains.com/issue/KT-69145
@file:DependsOn("io.github.typesafegithub:github-workflows-kt:3.2.0")

@file:Repository("https://bindings.krzeminski.it/")
@file:DependsOn("actions:deploy-pages:v4")
@file:DependsOn("actions:upload-pages-artifact:v3")

import io.github.typesafegithub.workflows.actions.actions.DeployPages
import io.github.typesafegithub.workflows.actions.actions.UploadPagesArtifact
import io.github.typesafegithub.workflows.domain.ActionStep
import io.github.typesafegithub.workflows.domain.Concurrency
import io.github.typesafegithub.workflows.domain.Environment
import io.github.typesafegithub.workflows.domain.Mode.Write
import io.github.typesafegithub.workflows.domain.Permission.IdToken
import io.github.typesafegithub.workflows.domain.Permission.Pages
import io.github.typesafegithub.workflows.domain.RunnerType.UbuntuLatest
import io.github.typesafegithub.workflows.domain.triggers.Release
import io.github.typesafegithub.workflows.domain.triggers.WorkflowCall
import io.github.typesafegithub.workflows.domain.triggers.WorkflowCall.Input as WorkflowCallInput
import io.github.typesafegithub.workflows.domain.triggers.WorkflowCall.Type.String as WorkflowCallInputTypeString
import io.github.typesafegithub.workflows.domain.triggers.WorkflowDispatch
import io.github.typesafegithub.workflows.domain.triggers.WorkflowDispatch.Input as WorkflowDispatchInput
import io.github.typesafegithub.workflows.domain.triggers.WorkflowDispatch.Type.String as WorkflowDispatchInputTypeString
import io.github.typesafegithub.workflows.dsl.expressions.Contexts.github
import io.github.typesafegithub.workflows.dsl.expressions.expr
import io.github.typesafegithub.workflows.dsl.workflow

workflow(
    name = "Publish GitHub Pages",
    on = listOf(
        WorkflowDispatch(
            inputs = mapOf(
                "checkout-ref" to WorkflowDispatchInput(
                    description = "The branch, tag or SHA to checkout. See actions/checkout 'ref'.",
                    required = false,
                    type = WorkflowDispatchInputTypeString
                )
            )
        ),
        WorkflowCall(
            inputs = mapOf(
                "checkout-ref" to WorkflowCallInput(
                    description = "The branch, tag or SHA to checkout. See actions/checkout 'ref'.",
                    required = false,
                    type = WorkflowCallInputTypeString
                )
            )
        ),
        Release(types = listOf("published"))
    ),
    sourceFile = __FILE__,
    concurrency = Concurrency(
        group = "Publish Site: ${expr { github.workflow }}",
        cancelInProgress = false
    )
) {
    val buildSite = buildJob(
        id = "build-site",
        name = "Build Site",
        ref = expr("inputs.checkout-ref || ${github.ref}")
    ) {
        run(
            name = "Build site",
            command = "./gradlew :docs:dokkatooGeneratePublicationHtml"
        )
        uses(
            name = "Upload Dokka docs to Pages",
            action = UploadPagesArtifact(
                path = "./docs/build/dokka/html/"
            )
        )
    }

    val deploymentStep = ActionStep(
        id = "deployment",
        name = "Deploy to GitHub Pages",
        action = DeployPages()
    )
    job(
        id = "deploy",
        name = "Deploy Site",
        runsOn = UbuntuLatest,
        needs = listOf(buildSite),
        permissions = mapOf(
            Pages to Write,  // to deploy to Pages
            IdToken to Write // to verify the deployment originates from an appropriate source
        ),
        environment = Environment(
            name = "github-pages",
            url = expr(deploymentStep.outputs.pageUrl)
        )
    ) {
        uses(deploymentStep)
    }
}
