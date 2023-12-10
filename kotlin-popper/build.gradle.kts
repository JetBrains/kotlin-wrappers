plugins {
    `kotlin-conventions`
    `publish-conventions`
    seskar()
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinBrowser)

    jsMainImplementation(seskarCore())

    jsMainApi(npmv("@popperjs/core"))
}
