import java.util.*

rootProject.name = "build-logic"

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

val props = Properties().apply {
    rootDir.resolve("../gradle.properties")
        .inputStream()
        .use { load(it) }
}

fun version(target: String): String {
    val propName = "${target}.version"
    return props.getProperty(propName)
        ?: extra[propName] as String
}

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            library(
                "serialization-json",
                "org.jetbrains.kotlinx",
                "kotlinx-serialization-json"
            ).version(version("kotlinx-serialization"))
        }

        create("gradlePlugins") {
            library("kotlin", "org.jetbrains.kotlin", "kotlin-gradle-plugin").version(version("kotlin"))
            library("jsPlainObjects", "org.jetbrains.kotlin", "js-plain-objects").version(version("kotlin"))
            library("seskar", "io.github.turansky.seskar", "seskar-gradle-plugin").version(version("seskar"))
            library("dokka", "org.jetbrains.dokka", "dokka-gradle-plugin").version(version("dokka"))
            library(
                "karakum",
                "io.github.sgrishchenko.karakum",
                "io.github.sgrishchenko.karakum.gradle.plugin"
            ).version(version("karakum"))
            library(
                "kfc-library",
                "io.github.turansky.kfc.library",
                "io.github.turansky.kfc.library.gradle.plugin"
            ).version(version("kfc"))
        }
    }
}

include("generatorbuild")
include("generatorlegacybuild")
include("wrappersbuild")
