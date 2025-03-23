plugins {
    kotlin("multiplatform")
    kotlin("plugin.js-plain-objects")
    id("io.github.turansky.seskar")
    id("kotlin-test-conventions")
}

kotlin {
    compilerOptions {
        allWarningsAsErrors = true

        optIn.addAll(
            "kotlin.js.ExperimentalJsExport",
        )
    }

    js {
        outputModuleName = project.name

        compilerOptions {
            target = "es2015"
        }

        browser {
            commonWebpackConfig {
                outputFileName = "index.js"

                cssSupport {
                    enabled = true
                }
            }
        }

        binaries.executable()
    }

    sourceSets {
        jsMain {
            dependencies {
                implementation(devNpm("css-loader", "7.1.2"))
                implementation(devNpm("style-loader", "4.0.0"))
            }
        }
    }
}
