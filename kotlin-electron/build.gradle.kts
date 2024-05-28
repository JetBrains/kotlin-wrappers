plugins {
    `kotlin-library-conventions`
    karakum()
    // TEMP
    `elecron-js-plain-object-patch`
}

dependencies {
    jsMainApi(projects.kotlinNode)
    jsMainApi(projects.kotlinBrowser)

    jsMainApi(npmv("electron"))
}
