plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinReactCore)
    webMainApi(projects.kotlinTanstackRouterCore)

    webMainApi(npm(jspkg.tanstack.reactRouter))
}
