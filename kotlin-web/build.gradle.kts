plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinJs)

    webMainImplementation(libs.coroutines.core)

    webTestImplementation(libs.coroutines.test)
    webTestImplementation(libs.kotlin.test)
}
