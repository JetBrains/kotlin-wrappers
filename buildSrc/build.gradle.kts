import java.util.*

plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

val props = Properties().apply {
    file("../gradle.properties").inputStream().use { load(it) }
}

fun version(target: String): String {
    val propertyName = "${target}.version"
    val value = props.getProperty(propertyName)
    println("Build using $propertyName: $value")
    return value
}

dependencies {
    implementation(kotlin("gradle-plugin", version("kotlin")))
    implementation("io.github.turansky.seskar:seskar-gradle-plugin:${version("seskar")}")
    implementation("dev.adamko.dokkatoo:dokkatoo-plugin:2.3.1")
}
