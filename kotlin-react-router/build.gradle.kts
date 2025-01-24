plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinBrowser)
    jsMainApi(projects.kotlinReactCore)

    jsMainApi(npm(libs.npm.remixRun.router))
    jsMainApi(npm(libs.npm.reactRouter))
    jsMainApi(npm(libs.npm.reactRouterDom))
}
