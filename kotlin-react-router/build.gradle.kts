plugins {
    `kotlin-library-conventions`
    alias(libs.plugins.karakum)
}

dependencies {
    jsMainApi(projects.kotlinBrowser)
    jsMainApi(projects.kotlinRemixRunRouter)
    jsMainApi(projects.kotlinReactCore)

    jsMainApi(npm(libs.npm.reactRouter))
}
