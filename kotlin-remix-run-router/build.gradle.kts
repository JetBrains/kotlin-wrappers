plugins {
    `kotlin-library-conventions`
    alias(libs.plugins.karakum)
}

dependencies {
    jsMainApi(projects.kotlinBrowser)

    jsMainApi(npm(libs.npm.remixRun.router))
}
