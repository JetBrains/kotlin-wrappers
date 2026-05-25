plugins {
    id("examplesbuild.kotlin-conventions")
}

dependencies {
    webMainImplementation(kotlinWrappers.emotion.react)
    webMainImplementation(kotlinWrappers.js)
    webMainImplementation(kotlinWrappers.react)
    webMainImplementation(kotlinWrappers.reactUse)
    webMainImplementation(kotlinWrappers.reactDom)
}
