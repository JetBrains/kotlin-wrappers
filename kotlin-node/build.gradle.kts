plugins {
    `kotlin-library-conventions`
    karakum()
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinWeb)

    jsMainApi(devNpmv("@types/node"))

    jsTestImplementation(kotlin("test-js"))
}
