import org.jetbrains.kotlin.gradle.dsl.KotlinCompile

plugins {
    kotlin("js")
    `kotlin-conventions`
    `publish-conventions`
}

tasks.withType<KotlinCompile<*>>().configureEach {
    kotlinOptions.freeCompilerArgs += "-opt-in=kotlin.contracts.ExperimentalContracts"
}

dependencies {
    api(project(":kotlin-extensions"))

    api(npmv("typescript"))
}
