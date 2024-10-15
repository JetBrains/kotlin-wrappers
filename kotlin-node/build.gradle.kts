plugins {
    `kotlin-library-conventions`
    alias(libs.plugins.karakum)
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinWeb)

    jsMainImplementation(libs.coroutines.core)

    jsMainApi(devNpm(libs.npm.types.node))

    jsTestImplementation(libs.kotlin.test)
}
