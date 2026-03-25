plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinJs)

    webMainImplementation(projects.kotlinJsPlainObject)

    webMainImplementation(libs.coroutines.core)
}
