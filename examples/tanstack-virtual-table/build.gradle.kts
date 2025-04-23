plugins {
    id("examplesbuild.kotlin-conventions")
}

dependencies {
    jsMainImplementation(kotlinWrappers.react)
    jsMainImplementation(kotlinWrappers.reactDom)
    jsMainImplementation(kotlinWrappers.reactUse)
    jsMainImplementation(kotlinWrappers.emotion.react)
    jsMainImplementation(kotlinWrappers.emotion.styled)

    jsMainImplementation(kotlinWrappers.tanstack.queryCore)
    jsMainImplementation(kotlinWrappers.tanstack.reactQuery)

    jsMainImplementation(kotlinWrappers.tanstack.tableCore)
    jsMainImplementation(kotlinWrappers.tanstack.reactTable)

    jsMainImplementation(kotlinWrappers.tanstack.virtualCore)
    jsMainImplementation(kotlinWrappers.tanstack.reactVirtual)

    jsMainImplementation(kotlinWrappers.preact.signalsCore)
    jsMainImplementation(kotlinWrappers.preact.signalsReact)
}
