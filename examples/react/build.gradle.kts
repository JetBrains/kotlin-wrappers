plugins {
    `kotlin-conventions`
}

dependencies {
    jsMainImplementation(kotlinWrappers.emotion)
    jsMainImplementation(kotlinWrappers.js)
    jsMainImplementation(kotlinWrappers.react)
    jsMainImplementation(kotlinWrappers.reactDom)
    jsMainImplementation(kotlinWrappers.reactUse)
}
