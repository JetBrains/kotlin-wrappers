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
}

dependencyResolutionManagement {
    versionCatalogs {
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
        }
    }
}

include("generatorbuild")
include("generatorlegacybuild")
include("wrappersbuild")
