plugins {
    `kotlin-dsl`
    alias(libs.plugins.serialization)
}

dependencies {
    implementation(gradlePlugins.kotlin)
    implementation(gradlePlugins.jsPlainObjects)
    implementation(gradlePlugins.kfc.library)

    implementation(libs.serialization.json)
}
