@file:OptIn(ExperimentalWasmDsl::class)

import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTargetWithSimulatorTests

plugins {
    id("wrappersbuild.kotlin-legacy-library-conventions")
}

kotlin {
    jvm()
    js {
        browser {
            testTask {
                testLogging.showStandardStreams = true
                useKarma {
                    useChromeHeadlessNoSandbox()
                }
            }
        }
    }
    wasmJs()

    // Sets the device ID for iosSimulatorArm64Test
    targets.withType<KotlinNativeTargetWithSimulatorTests> {
        testRuns["test"].deviceId = "iPhone 16"
    }
}

dependencies {
    commonTestImplementation(libs.kotlin.test)
}
