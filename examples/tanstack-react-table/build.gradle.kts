plugins {
    `kotlin-conventions`
}

dependencies {
    jsMainImplementation(kotlinWrappers.react)
    jsMainImplementation(kotlinWrappers.reactDom)
    jsMainImplementation(kotlinWrappers.reactUse)
    jsMainImplementation(kotlinWrappers.emotion)
    jsMainImplementation(kotlinWrappers.tanstack.queryCore)
    jsMainImplementation(kotlinWrappers.tanstack.reactQuery)
    jsMainImplementation(kotlinWrappers.tanstack.reactTable)
    jsMainImplementation(kotlinWrappers.preact.signalsCore)
    jsMainImplementation(kotlinWrappers.preact.signalsReact)
}
