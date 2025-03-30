plugins {
    `kotlin-library-conventions`
}

dependencies {
    commonMainApi(projects.kotlinJs)
    commonMainApi(projects.kotlinBrowser)

    commonMainApi(npm(libs.npm.popperjs.core))
}
