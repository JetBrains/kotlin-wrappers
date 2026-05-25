plugins {
    id("examplesbuild.kotlin-conventions")
}

dependencies {
    webMainImplementation(kotlinWrappers.js)
    webMainImplementation(kotlinWrappers.react)
    webMainImplementation(kotlinWrappers.reactDom)
    webMainImplementation(kotlinWrappers.reactUse)
}
