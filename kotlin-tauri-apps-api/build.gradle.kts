plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinJs)
    webMainApi(projects.kotlinWeb)

    webMainApi(npm(jspkg.tauriApps.api))
}
