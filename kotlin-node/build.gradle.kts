plugins {
    `kotlin-library-conventions`
    alias(libs.plugins.karakum)
}

dependencies {
    commonMainApi(projects.kotlinJs)
    commonMainApi(projects.kotlinWeb)

    commonMainImplementation(libs.coroutines.core)

    jsMainApi(devNpm(libs.npm.types.node))

    commonTestImplementation(libs.kotlin.test)
    commonTestImplementation(libs.coroutines.test)
}
