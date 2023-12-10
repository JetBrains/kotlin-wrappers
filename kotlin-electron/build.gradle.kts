plugins {
    `kotlin-conventions`
    `publish-conventions`
    karakum()
}

dependencies {
    jsMainApi(projects.kotlinNode)
    jsMainApi(projects.kotlinBrowser)

    jsMainApi(npmv("electron"))
}
