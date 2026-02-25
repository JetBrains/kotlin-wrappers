plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinBrowser)
    jsMainApi(projects.kotlinReact)
    jsMainApi(projects.kotlinTanstackReactRouter)

    webMainApi(npm(jspkg.tanstack.reactRouterDevtools))
}
