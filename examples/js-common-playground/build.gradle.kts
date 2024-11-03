@file:OptIn(
    ExperimentalKotlinGradlePluginApi::class,
    ExperimentalWasmDsl::class,
)

import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.plugin.KotlinHierarchyTemplate
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSetTree
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

    applyHierarchyTemplate(defaultHierarchyTemplate())
}

private fun defaultHierarchyTemplate(): KotlinHierarchyTemplate =
    KotlinHierarchyTemplate {
        withSourceSetTree(KotlinSourceSetTree.main, KotlinSourceSetTree.test)

        common {
            group("jsCommon") {
                withJs()
                withWasmJs()
            }
        }
    }

tasks.withType<Kotlin2JsCompile>().configureEach {
    compilerOptions {
        target = "es2015"
    }
}
