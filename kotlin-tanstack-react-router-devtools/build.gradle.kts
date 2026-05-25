plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinBrowser)
    webMainApi(projects.kotlinReact)
    webMainApi(projects.kotlinTanstackReactRouter)

    webMainApi(npm(jspkg.tanstack.reactRouterDevtools))
}
