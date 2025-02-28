plugins {
    `kotlin-library-conventions`
}

dependencies {
    commonMainApi(projects.kotlinJsCore)

    commonMainImplementation(libs.coroutines.core)
    commonMainImplementation(libs.seskar.core)

    commonTestImplementation(libs.coroutines.test)
    commonTestImplementation(libs.kotlin.test)
}
