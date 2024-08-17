plugins {
    `kotlin-library-conventions`
    alias(libs.plugins.karakum)
}

dependencies {
    jsMainApi(projects.kotlinNode)
    jsMainApi(projects.kotlinBrowser)

    jsMainApi(npm(libs.npm.electron))
}
