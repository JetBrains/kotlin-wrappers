plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

kotlin {
    jvmToolchain(11) // Do not change!
    jvm()
    js()

    iosArm64()
    iosSimulatorArm64()
    iosX64()

    // Sets the device ID for iosSimulatorArm64Test
    targets.withType(org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTargetWithSimulatorTests::class.java) {
        testRuns["test"].deviceId = "iPhone 15"
    }

    sourceSets {
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }

        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test-junit"))
            }
        }

        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }
    }
}
