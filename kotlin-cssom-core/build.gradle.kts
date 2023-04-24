plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(project(":kotlin-js"))

    jsMainApi(devNpmv("csstype"))
}
