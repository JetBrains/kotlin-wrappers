plugins {
    id("kotlin-library-conventions")
}

dependencies {
    commonMainApi(projects.kotlinCssomCore)
    commonMainApi(projects.kotlinJs)
    commonMainApi(projects.kotlinBrowser)

    commonMainApi(devNpm(libs.npm.csstype))
}
