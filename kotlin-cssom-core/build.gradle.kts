plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinJs)

    jsMainApi(devNpmv("csstype"))
}
