@file:OptIn(
    ExperimentalWasmDsl::class,
)

import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile
import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask

plugins {
    kotlin("multiplatform")
    kotlin("plugin.js-plain-objects")
    id("kotlin-test-conventions")
    id("dokka-conventions")
}

kotlin {
    js {
        moduleName = project.name

        when (project.jsPlatform) {
            JsPlatform.WEB -> {
                browser()
                nodejs()
            }

            JsPlatform.BROWSER -> {
                browser()
            }

            JsPlatform.NODE -> {
                nodejs()
            }
        }
    }

    if (project.wasmSupported) {
        wasmJs {
            moduleName = project.name + "-wasm"

            when (project.jsPlatform) {
                JsPlatform.WEB -> {
                    browser()
                    nodejs()
                }

                JsPlatform.BROWSER -> {
                    browser()
                }

                JsPlatform.NODE -> {
                    nodejs()
                }
            }
        }
    }

    val generatedDir = projectDir.resolve("src/jsMain/generated")
    if (generatedDir.exists()) {
        sourceSets.jsMain {
            kotlin.srcDir(generatedDir)
        }
    }
}

tasks.withType<KotlinCompilationTask<*>>().configureEach {
    compilerOptions {
        allWarningsAsErrors = true

        freeCompilerArgs.addAll(
            "-Xexpect-actual-classes",

            "-opt-in=kotlin.ExperimentalStdlibApi",
            "-opt-in=kotlin.ExperimentalUnsignedTypes",
            "-opt-in=kotlin.contracts.ExperimentalContracts",
            "-opt-in=kotlin.js.ExperimentalJsExport",
        )
    }
}

tasks.withType<Kotlin2JsCompile>().configureEach {
    compilerOptions {
        target = "es2015"

        freeCompilerArgs.addAll(
            "-Xdont-warn-on-error-suppression",
            "-Xir-generate-inline-anonymous-functions",
            "-Xsuppress-warning=NOTHING_TO_INLINE",
        )
    }
}
