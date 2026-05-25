plugins {
    id("examplesbuild.kotlin-conventions")
}

dependencies {
    webMainImplementation(kotlinWrappers.react)
    webMainImplementation(kotlinWrappers.reactDom)
    webMainImplementation(kotlinWrappers.reactUse)
    webMainImplementation(kotlinWrappers.tanstack.tableCore)
    webMainImplementation(kotlinWrappers.tanstack.reactTable)
    webMainImplementation(kotlinWrappers.preact.signalsCore)
    webMainImplementation(kotlinWrappers.preact.signalsReact)
}
