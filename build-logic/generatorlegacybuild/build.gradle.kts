import java.util.*

plugins {
    `kotlin-dsl`
    // TEMP
    kotlin("plugin.serialization") version "2.1.21"
}

val props = Properties().apply {
    rootProject.file("../gradle.properties").inputStream().use { load(it) }
}

fun version(target: String): String {
    val propName = "${target}.version"
    return properties[propName] as? String
        ?: props.getProperty(propName)
}

dependencies {
    implementation(gradlePlugins.kotlin)
    implementation(gradlePlugins.jsPlainObjects)
    implementation("io.github.turansky.kfc.library:io.github.turansky.kfc.library.gradle.plugin:${version("kfc")}")

    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:${version("kotlinx-serialization")}")
}
