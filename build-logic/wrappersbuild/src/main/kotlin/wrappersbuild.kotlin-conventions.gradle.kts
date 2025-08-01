@file:OptIn(
    ExperimentalWasmDsl::class,
)

import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.targets.js.dsl.KotlinJsTargetDsl

plugins {
    kotlin("multiplatform")
    kotlin("plugin.js-plain-objects")
    id("wrappersbuild.tools-conventions")
    id("wrappersbuild.kotlin-test-conventions")
}

val COMMON_FREE_COMPILER_ARGS = listOf(
    "-Xexpect-actual-classes",
    "-Xdont-warn-on-error-suppression",

    "-Xwarning-level=NOTHING_TO_INLINE:disabled",
)

val COMMON_OPT_INS = listOf(
    "kotlin.ExperimentalStdlibApi",
    "kotlin.ExperimentalUnsignedTypes",
    "kotlin.contracts.ExperimentalContracts",
    "kotlin.js.ExperimentalJsExport",
)

val JS_FREE_COMPILER_ARGS = listOf(
    "-Xir-generate-inline-anonymous-functions",
)

kotlin {
    compilerOptions {
        allWarningsAsErrors = true
        freeCompilerArgs.addAll(COMMON_FREE_COMPILER_ARGS)
        optIn.addAll(COMMON_OPT_INS)
    }

    val jsTarget = project.jsTarget

    if (jsTarget.js) {
        js {
            configureJsTarget(moduleName = project.name)
        }
    }

    if (jsTarget.wasm) {
        wasmJs {
            configureJsTarget(moduleName = project.name + "-wasm")
        }
    }

    sourceSets.commonMain {
        kotlin.srcDir(projectDir.resolve("src/commonMain/generated"))
        kotlin.srcDir(projectDir.resolve("src/webMain/generated"))
        kotlin.srcDir(projectDir.resolve("src/webMain/kotlin"))
    }

    sourceSets.commonTest {
        kotlin.srcDir(projectDir.resolve("src/webTest/kotlin"))
    }

    sourceSets.jsMain {
        kotlin.srcDir(projectDir.resolve("src/jsMain/generated"))
    }
}

fun KotlinJsTargetDsl.configureJsTarget(
    moduleName: String,
) {
    outputModuleName = moduleName

    val jsPlatform = project.jsPlatform

    if (jsPlatform.browser) {
        browser {
            testTask {
                testLogging.showStandardStreams = true
                useKarma {
                    useChromeHeadlessNoSandbox()
                }
            }
        }
    }

    if (jsPlatform.node) {
        nodejs()
    }

    compilerOptions {
        target = "es2015"

        freeCompilerArgs.addAll(JS_FREE_COMPILER_ARGS)
    }
}
