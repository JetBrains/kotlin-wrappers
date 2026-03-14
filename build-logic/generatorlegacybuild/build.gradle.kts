plugins {
    `kotlin-dsl`
    alias(libs.plugins.serialization)
}

dependencies {
    implementation(libs.gradlePlugins.kotlin)
    implementation(libs.gradlePlugins.jsPlainObjects)
    implementation(libs.gradlePlugins.kfc.library)

    implementation(libs.serialization.json)
}
