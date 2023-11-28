plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
    karakum()
}

dependencies {
    jsMainApi(projects.kotlinBrowser)

    jsMainApi(npmv("@remix-run/router"))
}
