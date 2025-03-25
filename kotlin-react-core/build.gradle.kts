plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinCsstype)

    jsMainApi(libs.coroutines.core)

    commonTestImplementation(libs.kotlin.test)
    commonTestImplementation(libs.coroutines.test)

    jsMainApi(npm(libs.npm.react))
}
