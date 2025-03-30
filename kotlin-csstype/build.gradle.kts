plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinCssomCore)
    commonMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinBrowser)

    jsMainApi(devNpm(libs.npm.csstype))
}
