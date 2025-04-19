@file:OptIn(
    ExperimentalWasmDsl::class,
)

import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.targets.js.dsl.KotlinJsTargetDsl

plugins {
    kotlin("multiplatform")
    kotlin("plugin.js-plain-objects")
    id("tools-conventions")
    id("kotlin-test-conventions")
}

val COMMON_FREE_COMPILER_ARGS = listOf(
    "-Xexpect-actual-classes",
    "-Xdont-warn-on-error-suppression",

    "-Xsuppress-warning=NOTHING_TO_INLINE",
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

fun KotlinJsTargetDsl.configureJsTarget(
    moduleName: String,
) {
    outputModuleName = moduleName

    val jsPlatform = project.jsPlatform

    if (jsPlatform.browser) {
        browser()
    }

    if (jsPlatform.node) {
        nodejs()
    }

    compilerOptions {
        target = "es2015"

        freeCompilerArgs.addAll(JS_FREE_COMPILER_ARGS)
    }
}
