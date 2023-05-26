plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
    id("io.github.sgrishchenko.karakum")
}

dependencies {
    jsMainApi(project(":kotlin-node"))
    jsMainApi(project(":kotlin-browser"))

    jsMainApi(npmv("electron"))
}
