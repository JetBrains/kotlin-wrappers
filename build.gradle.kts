import org.jetbrains.kotlin.gradle.dsl.KotlinCompile
import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile
import org.jetbrains.kotlin.gradle.dsl.KotlinJsProjectExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinJsPluginWrapper

plugins {
    kotlin("js") apply false
}

subprojects {
    repositories {
        mavenCentral()
    }

    configurations.all {
        resolutionStrategy.dependencySubstitution {
            substitute(module("org.jetbrains.kotlin-wrappers:kotlin-styled-next")).apply {
                with(project(":kotlin-styled-next")){}
            }
            substitute(module("org.jetbrains.kotlin-wrappers:kotlin-react")).apply {
                with(project(":kotlin-react")){}
            }
            substitute(module("org.jetbrains.kotlin-wrappers:kotlin-react-dom")).apply {
                with(project(":kotlin-react-dom")){}
            }
        }
    }

    plugins.withType<KotlinJsPluginWrapper> {
        extensions.configure<KotlinJsProjectExtension> {
            js {
                moduleName = project.name
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
    gradleVersion = "7.1.1"
}
