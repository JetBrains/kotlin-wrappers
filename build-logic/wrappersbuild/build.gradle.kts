plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(gradlePlugins.kotlin)
    implementation(gradlePlugins.jsPlainObjects)
    implementation(gradlePlugins.seskar)
    implementation(gradlePlugins.dokka)
}
