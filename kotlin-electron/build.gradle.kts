plugins {
    `kotlin-library-conventions`
    alias(libs.plugins.karakum)
}

dependencies {
    jsMainApi(projects.kotlinNode)
    commonMainApi(projects.kotlinBrowser)

    jsMainApi(npm(libs.npm.electron))
}
