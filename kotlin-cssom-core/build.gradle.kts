plugins {
    `kotlin-library-conventions`
    seskar()
}

dependencies {
    jsMainApi(projects.kotlinJs)

    jsMainImplementation(seskarCore())

    jsMainApi(devNpmv("csstype"))
}
