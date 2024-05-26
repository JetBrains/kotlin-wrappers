plugins {
    `kotlin-library-conventions`
    karakum()
    // TEMP
    `node-js-plain-object-patch`
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinWeb)

    jsMainImplementation(kotlinxCoroutines("core"))

    jsMainApi(devNpmv("@types/node"))

    jsTestImplementation(kotlin("test-js"))
}
