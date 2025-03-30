plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinCssomCore)
    commonMainApi(projects.kotlinJs)
    commonMainApi(projects.kotlinBrowser)

    commonMainApi(devNpm(libs.npm.csstype))
}
