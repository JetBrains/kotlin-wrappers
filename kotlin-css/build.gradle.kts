plugins {
    kotlin("multiplatform")
    `publishing-conventions`
}

kotlin {
    jvm()
    js {
        browser()
    }

    sourceSets {
        val commonMain by getting {
            kotlin.srcDir("src/main/kotlin")
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }

        val commonTest by getting {
            kotlin.srcDir("src/test/kotlin")
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
                implementation(kotlin("test"))
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
                implementation(kotlin("test"))
                implementation(kotlin("test-js"))
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
