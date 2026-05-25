plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinJs)
    webMainApi(projects.kotlinBrowser)
    webMainApi(projects.kotlinTanstackVirtualCore)

    webMainApi(npm(jspkg.tanstack.reactVirtual))
}
