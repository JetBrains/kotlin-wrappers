plugins {
    `kotlin-library-conventions`
    seskar()
}

dependencies {
    jsMainApi(projects.kotlinBrowser)

    jsMainImplementation(seskarCore())

    jsMainApi(npmv("@tanstack/query-core"))
}
