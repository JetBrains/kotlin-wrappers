import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTargetWithSimulatorTests

plugins {
    `kotlin-legacy-library-conventions`
}

kotlin {
    jvmToolchain(11) // Do not change!
    jvm()
    js()

    iosArm64()
    iosSimulatorArm64()
    iosX64()

    // Sets the device ID for iosSimulatorArm64Test
    targets.withType<KotlinNativeTargetWithSimulatorTests> {
        testRuns["test"].deviceId = "iPhone 15"
    }

    sourceSets {
        commonTest {
            dependencies {
                implementation(libs.kotlin.test.common)
                implementation(libs.kotlin.test.annotations.common)
            }
        }

        jvmTest {
            dependencies {
                implementation(libs.kotlin.test.junit)
            }
        }

        jsTest {
            dependencies {
                implementation(libs.kotlin.test.js)
            }
        }
    }
}
