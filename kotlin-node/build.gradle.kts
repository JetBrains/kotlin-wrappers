plugins {
    `kotlin-library-conventions`
    alias(libs.plugins.karakum)
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinWeb)

    jsMainApi(devNpmv("@types/node"))

    jsTestImplementation(libs.kotlin.test.js)
}
