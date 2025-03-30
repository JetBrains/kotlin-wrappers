plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinCssomCore)
    commonMainApi(projects.kotlinJs)
    commonMainApi(projects.kotlinBrowser)

    jsMainApi(devNpm(libs.npm.csstype))
}
