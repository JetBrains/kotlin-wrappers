plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinBrowser)
    jsMainApi(projects.kotlinTanstackVirtualCore)

    jsMainApi(npmv("@tanstack/react-virtual"))
}
