plugins {
    `kotlin-library-conventions`
    `patch-node-types`
    karakum()
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinWeb)

    jsMainImplementation(kotlinxCoroutines("core"))

    jsMainApi(devNpmv("@types/node"))

    jsTestImplementation(kotlin("test-js"))
}
