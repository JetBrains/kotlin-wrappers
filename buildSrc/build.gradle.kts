import java.util.*

plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    // TODO: remove after issue fix
    //  https://youtrack.jetbrains.com/issue/KT-57687
    mavenCentral()
}

val props = Properties().apply {
    file("../gradle.properties").inputStream().use { load(it) }
}

fun version(target: String): String =
    props.getProperty("${target}.version")

dependencies {
    implementation(kotlin("gradle-plugin", version("kotlin")))
}
