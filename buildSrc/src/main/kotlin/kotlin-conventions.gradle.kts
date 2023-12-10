import org.jetbrains.kotlin.gradle.dsl.KotlinCompile
import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile

plugins {
    kotlin("multiplatform")
    id("npm-conventions")
}

kotlin {
    js {
        moduleName = project.name
        browser()
    }

    val generatedDir = projectDir.resolve("src/jsMain/generated")
    if (generatedDir.exists()) {
        sourceSets["jsMain"].kotlin.srcDir(generatedDir)
    }
}

tasks.withType<KotlinCompile<*>>().configureEach {
    kotlinOptions {
        allWarningsAsErrors = true

        freeCompilerArgs += listOf(
            "-opt-in=kotlin.ExperimentalStdlibApi",
            "-opt-in=kotlin.ExperimentalUnsignedTypes",
            "-opt-in=kotlin.contracts.ExperimentalContracts",
        )
    }
}

tasks.withType<KotlinJsCompile>().configureEach {
    kotlinOptions {
        moduleKind = "commonjs"
        useEsClasses = true
    }
}
