@file:OptIn(
    ExperimentalKotlinGradlePluginApi::class,
    ExperimentalWasmDsl::class,
)

import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.plugin.KotlinHierarchyTemplate
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSetTree

plugins {
    kotlin("multiplatform")
}

kotlin {
    js()
    wasmJs()

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
