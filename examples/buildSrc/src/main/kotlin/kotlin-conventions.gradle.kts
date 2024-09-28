import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile
import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask

plugins {
    kotlin("multiplatform")
    kotlin("plugin.js-plain-objects")
    id("io.github.turansky.seskar")
    id("kotlin-test-conventions")
}

kotlin {
    js {
        moduleName = project.name

        browser {
            commonWebpackConfig {
                outputFileName = "index.js"

                cssSupport {
                    enabled = true
                    mode = "inline"
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

tasks.withType<KotlinCompilationTask<*>>().configureEach {
    compilerOptions {
        allWarningsAsErrors = true

        freeCompilerArgs.addAll(
            "-opt-in=kotlin.js.ExperimentalJsExport",
        )
    }
}

tasks.withType<Kotlin2JsCompile>().configureEach {
    compilerOptions {
        target = "es2015"
    }
}
