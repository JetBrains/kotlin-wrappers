plugins {
    id("examplesbuild.kotlin-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        implementation(kotlinWrappers.emotion.react)
        implementation(kotlinWrappers.js)
        implementation(kotlinWrappers.react)
        implementation(kotlinWrappers.reactUse)
        implementation(kotlinWrappers.reactDom)
    }
}
