import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile
import org.jetbrains.kotlin.gradle.dsl.KotlinJsProjectExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinJsPluginWrapper
import org.jetbrains.kotlin.gradle.dsl.KotlinCompile
import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpack
import org.jetbrains.kotlin.gradle.tasks.KotlinJsDce

plugins {
    kotlin("js") apply false
}

subprojects {
    repositories {
        jcenter()
        maven("https://dl.bintray.com/kotlin/kotlin-eap")
        maven("https://dl.bintray.com/kotlin/kotlin-dev")
        maven("https://kotlin.bintray.com/kotlinx")
        maven("https://dl.bintray.com/kotlin/kotlin-js-wrappers")
    }

    plugins.withType<KotlinJsPluginWrapper> {
        extensions.getByType<KotlinJsProjectExtension>().apply {
            target {
                browser()
            }
        }

        dependencies {
            "implementation"(kotlin("stdlib-js"))
            "implementation"(kotlinxHtml("js"))
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
            kotlinOptions.allWarningsAsErrors = true
        }
    }

    // Kotlin 1.3.72
    // COMPAT START
    tasks.withType<KotlinJsDce>().configureEach {
        enabled = false
    }

    tasks.withType<KotlinWebpack>().configureEach {
        enabled = false
    }
    // COMPAT END
}

tasks.wrapper {
    distributionType = Wrapper.DistributionType.ALL
}
