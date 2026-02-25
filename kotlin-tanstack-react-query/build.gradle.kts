plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    jsMainApi(projects.kotlinReact)
    jsMainApi(projects.kotlinTanstackQueryCore)

    webMainApi(npm(jspkg.tanstack.reactQuery))
}
