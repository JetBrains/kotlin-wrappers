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
        outputModuleName = project.name

        browser()
        nodejs()
    }

    wasmJs {
        outputModuleName = project.name + "-wasm"

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
