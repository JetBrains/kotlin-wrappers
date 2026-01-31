plugins {
    id("examplesbuild.kotlin-conventions")
}

dependencies {
    jsMainImplementation(kotlinWrappers.browser)
    jsMainImplementation(libs.coroutines.core)
}
