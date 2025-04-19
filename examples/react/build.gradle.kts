plugins {
    id("examplesbuild.kotlin-conventions")
}

dependencies {
    jsMainImplementation(kotlinWrappers.js)
    jsMainImplementation(kotlinWrappers.react)
    jsMainImplementation(kotlinWrappers.reactDom)
    jsMainImplementation(kotlinWrappers.reactUse)
}
