plugins {
    `kotlin-library-conventions`
    alias(libs.plugins.karakum)
}

dependencies {
    jsMainApi(projects.kotlinBrowser)

    jsMainApi(npmv(libs.npm.remix.run.router))
}
