plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

kotlinDslPluginOptions {
    experimentalWarning.set(false)
}

fun version(target: String): String =
    property("${target}.version") as String

dependencies {
    implementation(kotlin("gradle-plugin", version("kotlin")))
    implementation("com.github.node-gradle:gradle-node-plugin:${version("node-plugin")}")
    implementation("com.jfrog.bintray.gradle:gradle-bintray-plugin:${version("bintray-plugin")}")
    implementation("org.json:json:${version("json")}")
}
