plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinBrowser)

    jsMainApi(npm(libs.npm.remixRun.router))
}
