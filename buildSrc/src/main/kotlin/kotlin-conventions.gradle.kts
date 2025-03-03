@file:OptIn(
    ExperimentalWasmDsl::class,
)

import org.gradle.util.Path.SEPARATOR
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile
import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask

plugins {
    kotlin("multiplatform")
    kotlin("plugin.js-plain-objects")
    id("kotlin-test-conventions")
}

kotlin {
    js {
        val projectDirectory = layout.projectDirectory.asFile
        val rootProjectDirectory = rootProject.layout.projectDirectory.asFile
        val projectPath = projectDirectory.relativeTo(rootProjectDirectory).path

        moduleName = project.path.replace(SEPARATOR, "-")

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

    val commonGeneratedDir = projectDir.resolve("src/commonMain/generated")
    if (commonGeneratedDir.exists()) {
        sourceSets.commonMain {
            kotlin.srcDir(commonGeneratedDir)
        }
    }

    val jsGeneratedDir = projectDir.resolve("src/jsMain/generated")
    if (jsGeneratedDir.exists()) {
        sourceSets.jsMain {
            kotlin.srcDir(jsGeneratedDir)
        }
    }
}

tasks.withType<KotlinCompilationTask<*>>().configureEach {
    compilerOptions {
        allWarningsAsErrors = true

        freeCompilerArgs.addAll(
            "-Xexpect-actual-classes",
            "-Xdont-warn-on-error-suppression",

            "-Xsuppress-warning=NOTHING_TO_INLINE",

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
            "-Xir-generate-inline-anonymous-functions",
        )
    }
}
