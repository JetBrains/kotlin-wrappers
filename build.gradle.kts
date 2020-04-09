import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile
import org.jetbrains.kotlin.gradle.plugin.KotlinJsPluginWrapper

plugins {
    kotlin("js") apply false
}

group = "org.jetbrains"
version = "1.0-SNAPSHOT"

subprojects {
    repositories {
        jcenter()
        maven("https://dl.bintray.com/kotlin/kotlin-eap")
        maven("https://dl.bintray.com/kotlin/kotlin-dev")
        maven("https://kotlin.bintray.com/kotlinx")
        maven("https://dl.bintray.com/kotlin/kotlin-js-wrappers")
    }

    plugins.withType<KotlinJsPluginWrapper> {
        dependencies {
            "compile"(kotlin("stdlib-js"))
            "compile"(kotlinxHtml("js"))
        }

        tasks {
            withType<KotlinJsCompile>().configureEach {
                kotlinOptions {
                    moduleKind = "commonjs"

                    if (name == "compileKotlinJs") {
                        outputFile = "${project.projectDir}/build/classes/main/${project.name}.js"
                        sourceMapEmbedSources = "always"
                        sourceMap = true
                    } else {
                        sourceMap = false
                    }
                }
            }
        }
    }
}

tasks.wrapper {
    distributionType = Wrapper.DistributionType.ALL
}
