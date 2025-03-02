import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTargetWithSimulatorTests

plugins {
    `kotlin-legacy-library-conventions`
}

kotlin {
    jvm()
    js()

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
