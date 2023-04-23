plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(project(":kotlin-cssom-core"))
    jsMainApi(project(":kotlin-js"))
    jsMainApi(project(":kotlin-browser"))

    jsMainApi(devNpmv("csstype"))
}
