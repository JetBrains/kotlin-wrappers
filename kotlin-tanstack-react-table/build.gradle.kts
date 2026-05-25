plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinReact)
    webMainApi(projects.kotlinTanstackTableCore)

    webMainApi(npm(jspkg.tanstack.reactTable))
}
