plugins {
    id("examplesbuild.kotlin-conventions")
}

dependencies {
    webMainImplementation(kotlinWrappers.browser)
    webMainImplementation(libs.coroutines.core)
}
