plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinReactDom)
    webMainApi(projects.kotlinTanstackRouterCore)

    webMainApi(npm(jspkg.tanstack.reactRouter))
}
