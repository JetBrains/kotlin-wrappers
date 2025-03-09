plugins {
    `kotlin-library-conventions`
}

dependencies {
    commonMainApi(projects.kotlinJs)

    commonMainImplementation(libs.coroutines.core)
    commonMainImplementation(libs.seskar.core)

    jsTestImplementation(libs.coroutines.test)
    jsTestImplementation(libs.kotlin.test)
}
