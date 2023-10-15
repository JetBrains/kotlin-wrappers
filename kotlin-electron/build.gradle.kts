plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
    karakum()
}

dependencies {
    jsMainApi(project(":kotlin-node"))
    jsMainApi(project(":kotlin-browser"))

    jsMainApi(npmv("electron"))
}
