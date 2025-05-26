plugins {
    id("examplesbuild.kotlin-conventions")
    alias(libs.plugins.serialization)
}

dependencies {
    commonMainImplementation(libs.serialization.json)
    commonMainImplementation(kotlinWrappers.browser)
}
