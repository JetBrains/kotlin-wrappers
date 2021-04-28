import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile
import org.jetbrains.kotlin.gradle.dsl.KotlinJsProjectExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinJsPluginWrapper
import org.jetbrains.kotlin.gradle.dsl.KotlinCompile

plugins {
    kotlin("js") apply false
}

subprojects {
    repositories {
        mavenCentral()
    }

    plugins.withType<KotlinJsPluginWrapper> {
        extensions.configure<KotlinJsProjectExtension> {
            js {
                browser()
            }
        }

        tasks.withType<KotlinJsCompile>().configureEach {
            kotlinOptions {
                if (name == "compileKotlinJs") {
                    outputFile = jsOutputFile
                    sourceMapEmbedSources = "always"
                    sourceMap = true
                } else {
                    sourceMap = false
                }
            }
        }
    }

    afterEvaluate {
        tasks.withType<KotlinCompile<*>>().configureEach {
            if (!name.endsWith("JsIr")) {
                kotlinOptions.allWarningsAsErrors = true
            }
        }
    }
}

tasks.wrapper {
    distributionType = Wrapper.DistributionType.ALL
}
