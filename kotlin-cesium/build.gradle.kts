plugins {
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinBrowser)

    jsMainApi(npmv("cesium"))
}
