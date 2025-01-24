plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinBrowser)
    jsMainApi(projects.kotlinRemixRunRouter)
    jsMainApi(projects.kotlinReactCore)

    jsMainApi(npm(libs.npm.reactRouter))
}
