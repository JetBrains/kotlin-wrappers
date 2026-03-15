plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinBrowser)
    webMainApi(projects.kotlinTanstackHistory)

    webMainImplementation(libs.coroutines.core)

    webMainApi(npm(jspkg.tanstack.routerCore))
}
