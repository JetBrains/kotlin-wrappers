pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        mavenLocal()
        maven {
            url = uri("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        }
        maven {
            url = uri("https://packages.jetbrains.team/maven/p/ui/dev")
        }
    }


    resolutionStrategy {
        eachPlugin {
            when (requested.id.id) {
                "org.jetbrains.kotlin.multiplatform" -> {
                    useModule("org.jetbrains.kotlin.multiplatform:org.jetbrains.kotlin.multiplatform.gradle.plugin:1.5.21")
                }
                "kotlin2js" -> {
                    useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.21")
                }
                "org.jetbrains.compose" -> {
                    useModule("org.jetbrains.compose:org.jetbrains.compose.gradle.plugin:0.5.0-build262")
                }
            }
        }
    }
}

fun module(name: String, path: String) {
    include(name)
    project(name).projectDir = file(path)
}

include(":benchmark-core", "$rootDir/benchmark-core")
include("benchmark-core")
