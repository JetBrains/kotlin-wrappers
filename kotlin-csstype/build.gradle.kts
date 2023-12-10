plugins {
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(projects.kotlinCssomCore)
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinBrowser)

    jsMainApi(devNpmv("csstype"))
}
