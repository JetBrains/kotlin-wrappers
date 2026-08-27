plugins {
    id("examplesbuild.kotlin-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        implementation(kotlinWrappers.react)
        implementation(kotlinWrappers.reactDom)
        implementation(kotlinWrappers.reactUse)
        implementation(kotlinWrappers.tanstack.tableCore)
        implementation(kotlinWrappers.tanstack.reactTable)
        implementation(kotlinWrappers.preact.signalsCore)
        implementation(kotlinWrappers.preact.signalsReact)
    }
}
