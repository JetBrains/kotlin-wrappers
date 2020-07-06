import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile
import org.jetbrains.kotlin.gradle.dsl.KotlinJsProjectExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinJsPluginWrapper
import org.jetbrains.kotlin.gradle.dsl.KotlinCompile

plugins {
    kotlin("js") apply false
    id("kotlin-1.3-compat")
}

subprojects {
    repositories {
        jcenter()
        maven("https://kotlin.bintray.com/kotlinx")
        maven("https://kotlin.bintray.com/kotlin-js-wrappers")
        maven("https://kotlin.bintray.com/kotlin-eap")
        maven("https://kotlin.bintray.com/kotlin-dev")
    }

    plugins.withType<KotlinJsPluginWrapper> {
        extensions.configure<KotlinJsProjectExtension> {
            target {
                browser()
            }
        }

        dependencies {
            "implementation"(kotlin("stdlib-js"))
        }

        tasks.withType<KotlinJsCompile>().configureEach {
            kotlinOptions {
                moduleKind = "commonjs"

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

    tasks.withType<KotlinCompile<*>>().configureEach {
        if (!name.endsWith("JsIr")) {
//            kotlinOptions.allWarningsAsErrors = true
        }
    }
}

tasks.wrapper {
    distributionType = Wrapper.DistributionType.ALL
}
