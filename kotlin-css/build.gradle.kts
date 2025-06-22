@file:OptIn(ExperimentalWasmDsl::class)

import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTargetWithSimulatorTests

plugins {
    id("wrappersbuild.kotlin-legacy-library-conventions")
}

kotlin {
    jvm()
    js()
    wasmJs()

    // Sets the device ID for iosSimulatorArm64Test
    targets.withType<KotlinNativeTargetWithSimulatorTests> {
        testRuns["test"].deviceId = "iPhone 16"
    }

    sourceSets {
        commonTest {
            dependencies {
                implementation(libs.kotlin.test)
            }
        }

        jvmTest {
            dependencies {
                implementation(libs.kotlin.testJunit)
            }
        }
    }
}
