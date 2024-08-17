plugins {
    `kotlin-library-conventions`
    alias(libs.plugins.karakum)
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinWeb)

    jsMainApi(devNpmv(libs.npm.types.node))

    jsTestImplementation(libs.kotlin.test.js)
}
