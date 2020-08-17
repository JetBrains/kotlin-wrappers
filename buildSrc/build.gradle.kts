import java.util.*

plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    maven("https://kotlin.bintray.com/kotlin-eap")
    maven("https://kotlin.bintray.com/kotlin-dev")
}

kotlinDslPluginOptions {
    experimentalWarning.set(false)
}

val props = Properties().apply {
    file("../gradle.properties").inputStream().use { load(it) }
}

fun version(target: String): String =
    props.getProperty("${target}.version")

dependencies {
    implementation(kotlin("gradle-plugin", version("kotlin")))
    implementation("com.github.node-gradle:gradle-node-plugin:${version("node-plugin")}")
    implementation("com.jfrog.bintray.gradle:gradle-bintray-plugin:${version("bintray-plugin")}")
    implementation("org.json:json:${version("json")}")
}
