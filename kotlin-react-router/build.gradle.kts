plugins {
    `kotlin-library-conventions`
}

dependencies {
    commonMainApi(projects.kotlinBrowser)
    jsMainApi(projects.kotlinReactCore)
    jsMainApi(projects.kotlinReactDom)

    jsMainApi(npm(libs.npm.remixRun.router))
    jsMainApi(npm(libs.npm.reactRouter))
    jsMainApi(npm(libs.npm.reactRouterDom))
}
