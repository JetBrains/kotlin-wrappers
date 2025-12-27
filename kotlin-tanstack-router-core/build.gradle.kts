plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinBrowser)
    webMainApi(projects.kotlinTanstackHistory)

    webMainApi(npm(jspkg.tanstack.routerCore))
}
