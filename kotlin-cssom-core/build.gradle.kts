plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(project(":kotlin-js"))

    jsMainApi(devNpmv("csstype"))

    // TEMP
    jsMainApi(project(":kotlin-browser"))
}
