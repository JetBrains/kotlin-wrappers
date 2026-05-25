plugins {
    id("examplesbuild.kotlin-conventions")
    alias(libs.plugins.serialization)
}

dependencies {
    webMainImplementation(libs.serialization.json)
    webMainImplementation(kotlinWrappers.browser)
}
