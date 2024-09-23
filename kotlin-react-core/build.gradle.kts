plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinCsstype)

    jsMainApi(libs.coroutines.core)

    jsTestImplementation(libs.kotlin.test)
    jsTestImplementation(libs.coroutines.test)

    jsMainApi(npm(libs.npm.react))
}
