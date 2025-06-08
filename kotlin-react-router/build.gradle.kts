plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    commonMainApi(projects.kotlinBrowser)
    jsMainApi(projects.kotlinReactCore)
    jsMainApi(projects.kotlinReactDom)

    commonMainApi(npm(jspkg.remixRun.router))
    commonMainApi(npm(jspkg.reactRouter))
    commonMainApi(npm(jspkg.reactRouterDom))
}
