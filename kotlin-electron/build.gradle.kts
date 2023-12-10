plugins {
    `kotlin-library-conventions`
    karakum()
}

dependencies {
    jsMainApi(projects.kotlinNode)
    jsMainApi(projects.kotlinBrowser)

    jsMainApi(npmv("electron"))
}
