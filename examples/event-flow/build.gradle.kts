plugins {
    id("examplesbuild.kotlin-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        implementation(kotlinWrappers.browser)
        implementation(libs.coroutines.core)
    }
}
