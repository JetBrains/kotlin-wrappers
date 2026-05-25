plugins {
    id("examplesbuild.kotlin-conventions")
}

dependencies {
    webMainImplementation(kotlinWrappers.js)
    webMainImplementation(kotlinWrappers.react)
    webMainImplementation(kotlinWrappers.reactUse)
    webMainImplementation(kotlinWrappers.reactDom)
    webMainImplementation(kotlinWrappers.tanstack.reactRouter)
}
