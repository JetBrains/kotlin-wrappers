plugins {
    `kotlin-legacy-library-conventions`
}

kotlin {
    jvm()
    js()

    // Sets the device ID for iosSimulatorArm64Test
    targets.withType(org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTargetWithSimulatorTests::class.java) {
        testRuns["test"].deviceId = "iPhone 15"
    }

    sourceSets {
        val commonTest by getting {
            dependencies {
                implementation(libs.kotlin.test.common)
                implementation(libs.kotlin.test.annotations.common)
            }
        }

        val jvmTest by getting {
            dependencies {
                implementation(libs.kotlin.test.junit)
            }
        }

        val jsTest by getting {
            dependencies {
                implementation(libs.kotlin.test.js)
            }
        }
    }
}
