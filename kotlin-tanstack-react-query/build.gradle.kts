plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinReact)
    webMainApi(projects.kotlinTanstackQueryCore)

    webMainApi(npm(jspkg.tanstack.reactQuery))
}
