plugins {
    `kotlin-dsl`
    // TEMP
    kotlin("plugin.serialization") version "2.1.21"
}

dependencies {
    implementation(gradlePlugins.kotlin)
    implementation(gradlePlugins.jsPlainObjects)
    implementation(gradlePlugins.kfc.library)

    implementation(libs.serialization.json)
}
