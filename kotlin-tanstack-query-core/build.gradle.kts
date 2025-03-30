plugins {
    `kotlin-library-conventions`
}

dependencies {
    commonMainApi(projects.kotlinBrowser)

    jsMainApi(npm(libs.npm.tanstack.queryCore))
}
