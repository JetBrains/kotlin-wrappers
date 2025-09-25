@file:OptIn(
    ExperimentalWasmDsl::class,
)

import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.targets.js.dsl.KotlinJsTargetDsl

plugins {
    kotlin("multiplatform")
    kotlin("plugin.js-plain-objects")
    id("examplesbuild.tools-conventions")
    id("io.github.turansky.seskar")
}

val JS_FREE_COMPILER_ARGS = listOf(
    "-Xes-long-as-bigint",
    "-Xir-generate-inline-anonymous-functions",
)

kotlin {
    applyDefaultHierarchyTemplate()

    compilerOptions {
        allWarningsAsErrors = true

        optIn.addAll(
            "kotlin.js.ExperimentalJsExport",
            "kotlin.js.ExperimentalWasmJsInterop",
        )
    }

    val jsTarget = project.jsTarget

    if (jsTarget.js) {
        js {
            configureJsTarget()
        }

        sourceSets {
            jsMain {
                dependencies {
                    implementation(devNpm("css-loader", "7.1.2"))
                    implementation(devNpm("style-loader", "4.0.0"))
                }
            }
        }
    }

    if (jsTarget.wasm) {
        wasmJs {
            configureJsTarget()
        }
    }
}

fun KotlinJsTargetDsl.configureJsTarget() {
    outputModuleName = project.name

    val jsPlatform = project.jsPlatform

    if (jsPlatform.browser) {
        browser {
            commonWebpackConfig {
                outputFileName = "index.js"

                cssSupport {
                    enabled = true
                }
            }
        }

        binaries.executable()
    }

    if (jsPlatform.node) {
        nodejs()
    }

    compilerOptions {
        target = "es2015"

        freeCompilerArgs.addAll(JS_FREE_COMPILER_ARGS)
    }
}
