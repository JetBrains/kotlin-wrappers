#!/usr/bin/env kotlin

@file:Import("common.main.kts")

import io.github.typesafegithub.workflows.domain.triggers.WorkflowDispatch
import io.github.typesafegithub.workflows.dsl.workflow

workflow(
    name = "CI-K2.1.20",
    on = listOf(WorkflowDispatch()),
    sourceFile = __FILE__
) {
    buildJob(
        id = "build",
        name = "Build"
    ) {
        run(
            name = "Build",
            command = "./gradlew build -Pkotlin.version=2.1.20-Beta1"
        )
    }

    buildJob(
        id = "build-examples",
        name = "Build Examples"
    ) {
        run(
            name = "Build Examples",
            command = """
                ./gradlew publishToMavenLocal -Pkotlin.version=2.1.20-Beta1
                cd examples/
                ./gradlew build -Pkotlin.version=2.1.0-RC2  -Pseskar.version=3.50.1
            """.trimIndent()
        )
    }
}
