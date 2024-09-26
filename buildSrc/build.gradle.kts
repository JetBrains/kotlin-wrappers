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
    val propName = "${target}.version"
    return properties[propName] as? String
        ?: props.getProperty(propName)
}

dependencies {
    implementation(kotlin("gradle-plugin", version("kotlin")))
    implementation("org.jetbrains.kotlin:js-plain-objects:${version("kotlin")}")
    implementation("io.github.turansky.seskar:seskar-gradle-plugin:${version("seskar")}")
    implementation("dev.adamko.dokkatoo:dokkatoo-plugin:2.3.1")
}
