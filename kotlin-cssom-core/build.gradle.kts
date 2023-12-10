plugins {
    `kotlin-conventions`
    `publish-conventions`
    seskar()
}

dependencies {
    jsMainApi(projects.kotlinJs)

    jsMainImplementation(seskarCore())

    jsMainApi(devNpmv("csstype"))
}
