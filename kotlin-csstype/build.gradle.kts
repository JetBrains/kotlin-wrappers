plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinCssomCore)
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinBrowser)

    jsMainApi(devNpmv(libs.npm.csstype))
}
