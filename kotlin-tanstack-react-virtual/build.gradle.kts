plugins {
    `kotlin-library-conventions`
}

dependencies {
    commonMainApi(projects.kotlinJs)
    commonMainApi(projects.kotlinBrowser)
    jsMainApi(projects.kotlinTanstackVirtualCore)

    jsMainApi(npm(libs.npm.tanstack.reactVirtual))
}
