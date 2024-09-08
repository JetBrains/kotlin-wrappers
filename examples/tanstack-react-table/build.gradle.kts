plugins {
    `kotlin-conventions`
}

dependencies {
    jsMainImplementation(libs.wrappers.react)
    jsMainImplementation(libs.wrappers.reactDom)
    jsMainImplementation(libs.wrappers.emotion)
    jsMainImplementation(libs.wrappers.tanstack.reactQuery)
    jsMainImplementation(libs.wrappers.tanstack.reactTable)
}
