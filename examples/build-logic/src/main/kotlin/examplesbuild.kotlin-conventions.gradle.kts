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

kotlin {
    compilerOptions {
        allWarningsAsErrors = true

        optIn.addAll(
            "kotlin.js.ExperimentalJsExport",
        )
    }

    val jsTarget = project.jsTarget

    if (jsTarget.js) {
        js {
            configureJsTarget(moduleName = project.name)
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
            configureJsTarget(moduleName = project.name + "-wasm")
        }
    }
}

fun KotlinJsTargetDsl.configureJsTarget(
    moduleName: String,
) {
    outputModuleName = moduleName

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
    }
}
