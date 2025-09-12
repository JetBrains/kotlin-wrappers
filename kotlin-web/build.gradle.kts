plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinJs)
    webMainApi(libs.coroutines.core)

    commonTestImplementation(libs.coroutines.test)
    commonTestImplementation(libs.kotlin.test)
}
