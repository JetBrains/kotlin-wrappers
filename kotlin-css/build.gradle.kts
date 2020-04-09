plugins {
    kotlin("multiplatform")
    `publishing-conventions`
}

kotlin {
    js()
    jvm()

    sourceSets {
        val commonMain by getting {
            kotlin.srcDir("src/main/kotlin")
            dependencies {
                api(kotlin("stdlib-common"))
            }
        }

        val commonTest by getting {
            kotlin.srcDir("src/test/kotlin")
            dependencies {
                api(kotlin("test-common"))
                api(kotlin("test-annotations-common"))
            }
        }

        val jvmMain by getting {
            dependencies {
                api(kotlin("stdlib-jdk8"))
            }
        }

        val jvmTest by getting {
            dependencies {
                api(kotlin("test"))
                api(kotlin("test-junit"))
            }
        }

        val jsMain by getting {
            dependencies {
                api(kotlin("stdlib-js"))
                api(project(":kotlin-extensions"))
            }
        }

        val jsTest by getting {
            dependencies {
                api(kotlin("test"))
                api(kotlin("test-js"))
            }
        }
    }
}

project("kotlin-css-js") {
    apply(plugin = "org.jetbrains.kotlin.js")
    apply(plugin = "npm-publishing-conventions")

    dependencies {
        "api"(project(":kotlin-css"))
    }
}

project("kotlin-css-jvm") {
    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "npm-publishing-conventions")

    dependencies {
        "api"(project(":kotlin-css"))
    }
}
