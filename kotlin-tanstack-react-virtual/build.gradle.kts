plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    commonMainApi(projects.kotlinJs)
    commonMainApi(projects.kotlinBrowser)
    jsMainApi(projects.kotlinTanstackVirtualCore)

    commonMainApi(npm(jspkg.tanstack.reactVirtual))
}
