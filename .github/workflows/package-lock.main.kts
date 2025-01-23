#!/usr/bin/env kotlin

@file:Import("common.main.kts")

@file:Repository("https://repo.maven.apache.org/maven2/")
// work-around for https://youtrack.jetbrains.com/issue/KT-69145
@file:DependsOn("io.github.typesafegithub:github-workflows-kt:3.2.0")

@file:Repository("https://bindings.krzeminski.it/")
@file:DependsOn("karakum-team:vitalik:v0.9")

import io.github.typesafegithub.workflows.actions.karakumteam.Vitalik_Untyped
import io.github.typesafegithub.workflows.domain.Concurrency
import io.github.typesafegithub.workflows.domain.RunnerType.UbuntuLatest
import io.github.typesafegithub.workflows.domain.triggers.Push
import io.github.typesafegithub.workflows.dsl.expressions.expr
import io.github.typesafegithub.workflows.dsl.workflow

workflow(
    name = "Package Lock",
    on = listOf(
        Push(
            branches = listOf("master")
        )
    ),
    sourceFile = __FILE__,
    concurrency = Concurrency(
        group = "${expr { github.workflow }}-${expr { github.ref }}",
        cancelInProgress = true
    )
) {
    job(
        id = "update",
        name = "Update",
        runsOn = UbuntuLatest
    ) {
        uses(
            name = "Update",
            action = Vitalik_Untyped()
        )
    }
}
