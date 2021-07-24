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
            if (requested.id.id == "org.jetbrains.kotlin.multiplatform") {
                useModule("org.jetbrains.kotlin.multiplatform:org.jetbrains.kotlin.multiplatform.gradle.plugin:1.5.10")
            } else if (requested.id.id == "kotlin2js") {
                useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:${requested.version}")
            } else if (requested.id.id == "org.jetbrains.compose") {
                useModule("org.jetbrains.compose:org.jetbrains.compose.gradle.plugin:0.5.0-build262")
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
