plugins {
    id("examplesbuild.kotlin-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        implementation(kotlinWrappers.react)
        implementation(kotlinWrappers.reactDom)
        implementation(kotlinWrappers.reactUse)
        implementation(kotlinWrappers.emotion.react)
        implementation(kotlinWrappers.tanstack.queryCore)
        implementation(kotlinWrappers.tanstack.reactQuery)
        implementation(kotlinWrappers.tanstack.tableCore)
        implementation(kotlinWrappers.tanstack.reactTable)
        implementation(kotlinWrappers.preact.signalsCore)
        implementation(kotlinWrappers.preact.signalsReact)

        implementation(projects.tanstackTableCommon)
    }
}
