plugins {
    `kotlin-library-conventions`
    alias(libs.plugins.karakum)
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinWeb)

    jsMainApi(devNpm(libs.npm.types.node))

    jsTestImplementation(libs.kotlin.testJs)
}
