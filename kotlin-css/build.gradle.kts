plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

kotlin {
    jvm()
    js {
        moduleName = project.name
        browser()
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
