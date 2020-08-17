plugins {
    kotlin("multiplatform")
    `publishing-conventions`
}

kotlin {
    jvm()
    js {
        moduleName = project.name
        browser()
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }

        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }

        val jvmMain by getting {
            dependencies {
                implementation(kotlin("stdlib-jdk8"))
            }
        }

        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test-junit"))
            }
        }

        val jsMain by getting {
            dependencies {
                implementation(kotlin("stdlib-js"))
            }
        }

        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }
    }
}

// TODO: remove after migration on 1.4-M2
tasks.named("build") {
    dependsOn(project(":kotlin-css:npm-adapter").tasks.named("build"))
}
