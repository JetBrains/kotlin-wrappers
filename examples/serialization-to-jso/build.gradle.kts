plugins {
    id("examplesbuild.kotlin-conventions")
    alias(libs.plugins.serialization)
}

kotlin {
    sourceSets.webMain.dependencies {
        implementation(libs.serialization.json)
        implementation(kotlinWrappers.browser)
    }
}
