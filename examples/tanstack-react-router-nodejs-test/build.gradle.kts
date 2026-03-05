plugins {
    id("examplesbuild.kotlin-conventions")
}

kotlin {
    js(IR) {
        nodejs {}
    }
}
dependencies {
    jsMainImplementation(kotlinWrappers.js)
    jsMainImplementation(kotlinWrappers.react)
    jsMainImplementation(kotlinWrappers.reactUse)
    jsMainImplementation(kotlinWrappers.reactDom)
    jsMainImplementation(kotlinWrappers.tanstack.reactRouter)
    jsTestImplementation(kotlin("test"))
}
