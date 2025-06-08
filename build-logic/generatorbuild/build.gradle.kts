plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

dependencies {
    // TODO: use version helper when get rid of karakum v66
    implementation("io.github.sgrishchenko.karakum:io.github.sgrishchenko.karakum.gradle.plugin:1.0.0-alpha.71")
}
