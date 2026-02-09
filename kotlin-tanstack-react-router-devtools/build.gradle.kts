plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinBrowser)
    jsMainApi(projects.kotlinReactCore)
    jsMainApi(projects.kotlinTanstackReactRouter)

    webMainApi(npm(jspkg.tanstack.reactRouterDevtools))
}
