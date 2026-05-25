plugins {
    id("examplesbuild.kotlin-conventions")
}

dependencies {
    webMainImplementation(kotlinWrappers.react)
    webMainImplementation(kotlinWrappers.reactDom)
    webMainImplementation(kotlinWrappers.reactUse)
    webMainImplementation(kotlinWrappers.emotion.react)
    webMainImplementation(kotlinWrappers.emotion.styled)
    webMainImplementation(kotlinWrappers.tanstack.queryCore)
    webMainImplementation(kotlinWrappers.tanstack.reactQuery)
    webMainImplementation(kotlinWrappers.tanstack.tableCore)
    webMainImplementation(kotlinWrappers.tanstack.reactTable)
    webMainImplementation(kotlinWrappers.preact.signalsCore)
    webMainImplementation(kotlinWrappers.preact.signalsReact)

    webMainImplementation(projects.tanstackTableCommon)
}
