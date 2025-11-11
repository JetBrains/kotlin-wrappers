plugins {
    id("examplesbuild.kotlin-conventions")
}

dependencies {
    commonMainImplementation(kotlinWrappers.browser)
    commonMainImplementation(libs.coroutines.core)
}
