plugins {
    id("examplesbuild.kotlin-conventions")
}

dependencies {
    jsMainImplementation(kotlinWrappers.emotion.react)
    jsMainImplementation(kotlinWrappers.js)
    jsMainImplementation(kotlinWrappers.react)
    jsMainImplementation(kotlinWrappers.reactUse)
    jsMainImplementation(kotlinWrappers.reactDom)
}
