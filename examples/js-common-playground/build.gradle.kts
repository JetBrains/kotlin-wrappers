@file:OptIn(
    ExperimentalWasmDsl::class,
)

import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile

plugins {
    kotlin("multiplatform")
}

kotlin {
    js {
        moduleName = project.name

        browser()
        nodejs()
    }

    wasmJs {
        moduleName = project.name

        browser()
        nodejs()
    }
}

dependencies {
    "commonTestImplementation"(libs.kotlin.test)
}

tasks.withType<Kotlin2JsCompile>().configureEach {
    compilerOptions {
        target = "es2015"
    }
}
