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

val kotlinVersion = version("kotlin")
val k2Mode = kotlinVersion.startsWith("2.")
val seskarVersion = version("seskar")

dependencies {
    implementation(kotlin("gradle-plugin", kotlinVersion))
    if (k2Mode) {
        implementation("org.jetbrains.kotlin:js-plain-objects:$kotlinVersion")
    }
    implementation("io.github.turansky.seskar:seskar-gradle-plugin:$seskarVersion")
}
