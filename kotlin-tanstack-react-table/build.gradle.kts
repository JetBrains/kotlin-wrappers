plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    jsMainApi(projects.kotlinReact)
    jsMainApi(projects.kotlinTanstackTableCore)

    webMainApi(npm(jspkg.tanstack.reactTable))
}
