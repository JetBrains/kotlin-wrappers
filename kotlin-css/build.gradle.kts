@file:OptIn(ExperimentalWasmDsl::class)

import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTargetWithSimulatorTests

plugins {
    id("wrappersbuild.kotlin-legacy-library-conventions")
}

kotlin {
    jvmToolchain(11) // Do not change!
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

    iosArm64()
    iosSimulatorArm64()
    iosX64()

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
