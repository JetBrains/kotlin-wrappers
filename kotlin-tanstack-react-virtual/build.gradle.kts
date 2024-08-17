plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinBrowser)
    jsMainApi(projects.kotlinTanstackVirtualCore)

    jsMainApi(npmv(libs.npm.tanstack.react.virtual))
}
