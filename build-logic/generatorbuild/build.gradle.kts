import java.util.*

plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
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
    // TODO: use version helper when get rid of karakum v66
    implementation("io.github.sgrishchenko.karakum:io.github.sgrishchenko.karakum.gradle.plugin:1.0.0-alpha.71")
}
