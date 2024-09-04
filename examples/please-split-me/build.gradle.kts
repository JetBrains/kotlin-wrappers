plugins {
    `kotlin-conventions`
}

dependencies {
    jsMainImplementation(libs.wrappers.emotion)
    jsMainImplementation(libs.wrappers.js)
    jsMainImplementation(libs.wrappers.react)
    jsMainImplementation(libs.wrappers.reactUse)
    jsMainImplementation(libs.wrappers.reactDom)
    jsMainImplementation(libs.wrappers.reactRouterDom)
}
