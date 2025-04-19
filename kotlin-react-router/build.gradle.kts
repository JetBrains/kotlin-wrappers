plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    commonMainApi(projects.kotlinBrowser)
    jsMainApi(projects.kotlinReactCore)
    jsMainApi(projects.kotlinReactDom)

    commonMainApi(npm(libs.npm.remixRun.router))
    commonMainApi(npm(libs.npm.reactRouter))
    commonMainApi(npm(libs.npm.reactRouterDom))
}
