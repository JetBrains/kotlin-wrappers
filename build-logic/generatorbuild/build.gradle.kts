import java.util.Properties
import kotlin.apply

plugins {
    `kotlin-dsl`
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
    implementation("io.github.sgrishchenko.karakum:io.github.sgrishchenko.karakum.gradle.plugin:${version("karakum")}")
}
