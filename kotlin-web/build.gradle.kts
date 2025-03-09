plugins {
    `kotlin-library-conventions`
}

dependencies {
    commonMainApi(projects.kotlinJs)

    commonMainImplementation(libs.coroutines.core)

    jsTestImplementation(libs.coroutines.test)
    jsTestImplementation(libs.kotlin.test)
}
