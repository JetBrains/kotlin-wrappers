#!/usr/bin/env kotlin

@file:Import("common.main.kts")

import io.github.typesafegithub.workflows.actions.actions.Checkout
import io.github.typesafegithub.workflows.domain.RunnerType.UbuntuLatest
import io.github.typesafegithub.workflows.domain.triggers.PullRequest
import io.github.typesafegithub.workflows.domain.triggers.Push
import io.github.typesafegithub.workflows.dsl.workflow

workflow(
    name = "CI",
    on = listOf(
        Push(
            branches = listOf("master")
        ),
        PullRequest()
    ),
    sourceFile = __FILE__
) {
    job(
        id = "check_all_workflow_yaml_consistency",
        name = "Check all Workflow YAML Consistency",
        runsOn = UbuntuLatest
    ) {
        uses(
            name = "Checkout the repo",
            action = Checkout()
        )
        run(
            name = "Regenerate all Workflow YAMLs",
            command = """find .github/workflows -mindepth 1 -maxdepth 1 -name '*.main.kts' -exec {} \;"""
        )
        run(
            name = "Check for Modifications",
            command = """
                git add --intent-to-add .
                git diff --exit-code
            """.trimIndent()
        )
    }

    buildJob(
        id = "build",
        name = "Build"
    ) {
        run(
            name = "Build",
            command = "./gradlew build preprocessWorkflows"
        )
    }

    buildJob(
        id = "build-examples",
        name = "Build Examples"
    ) {
        run(
            name = "Build Examples",
            command = """
                ./gradlew publishToMavenLocal
                cd examples/
                ./gradlew build
            """.trimIndent()
        )
    }

    buildJob(
        id = "test",
        name = "Test"
    ) {
        run(
            name = "Tests and benchmarks",
            command = "./gradlew allTests -Ptest=true"
        )
    }
}
