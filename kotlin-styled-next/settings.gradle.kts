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
}

fun module(name: String, path: String) {
    include(name)
    project(name).projectDir = file(path)
}

include(":benchmark-core", "$rootDir/benchmark-core")
include("benchmark-core")
