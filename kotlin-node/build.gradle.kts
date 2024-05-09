plugins {
    `kotlin-library-conventions`
    karakum()
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinWeb)

    jsMainImplementation(kotlinxCoroutines("core"))

    jsMainApi(devNpmv("@types/node"))

    jsTestImplementation(kotlin("test-js"))
}
