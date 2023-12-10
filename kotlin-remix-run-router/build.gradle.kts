plugins {
    `kotlin-conventions`
    `publish-conventions`
    karakum()
    seskar()
}

dependencies {
    jsMainApi(projects.kotlinBrowser)

    jsMainImplementation(seskarCore())

    jsMainApi(npmv("@remix-run/router"))
}
