plugins {
    id("examplesbuild.kotlin-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        implementation(kotlinWrappers.js)
        implementation(kotlinWrappers.react)
        implementation(kotlinWrappers.reactDom)
        implementation(kotlinWrappers.reactUse)
        implementation(kotlinWrappers.mui.material)
        implementation(kotlinWrappers.emotion.styled)
    }
}
