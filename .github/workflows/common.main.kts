@file:Repository("https://repo.maven.apache.org/maven2/")
@file:DependsOn("io.github.typesafegithub:github-workflows-kt:3.2.0")

@file:Repository("https://bindings.krzeminski.it/")
@file:DependsOn("actions:checkout:v4")
@file:DependsOn("actions:setup-java:v4")
@file:DependsOn("gradle:actions__setup-gradle:v4")
@file:DependsOn("gradle:actions__wrapper-validation:v4")

import io.github.typesafegithub.workflows.actions.actions.Checkout
import io.github.typesafegithub.workflows.actions.actions.SetupJava
import io.github.typesafegithub.workflows.actions.actions.SetupJava.Distribution.Zulu
import io.github.typesafegithub.workflows.actions.gradle.ActionsSetupGradle
import io.github.typesafegithub.workflows.actions.gradle.ActionsWrapperValidation
import io.github.typesafegithub.workflows.domain.Job
import io.github.typesafegithub.workflows.domain.JobOutputs.EMPTY
import io.github.typesafegithub.workflows.domain.RunnerType.UbuntuLatest
import io.github.typesafegithub.workflows.dsl.JobBuilder
import io.github.typesafegithub.workflows.dsl.WorkflowBuilder

fun WorkflowBuilder.buildJob(
    id: String,
    name: String,
    ref: String? = null,
    block: JobBuilder<EMPTY>.() -> Unit,
): Job<EMPTY> = job(
    id = id,
    name = name,
    runsOn = UbuntuLatest
) {
    uses(
        name = "Checkout the repo",
        action = Checkout(ref_Untyped = ref)
    )
    uses(
        name = "Validate Gradle Wrapper",
        action = ActionsWrapperValidation()
    )
    uses(
        name = "Set up JDK 21",
        action = SetupJava(
            javaVersion = "21",
            distribution = Zulu
        )
    )
    uses(
        name = "Setup Gradle",
        action = ActionsSetupGradle()
    )
    block()
}
