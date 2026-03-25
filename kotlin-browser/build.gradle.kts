plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinJs)
    webMainApi(projects.kotlinCssomCore)
    webMainApi(projects.kotlinWeb)

    webMainImplementation(projects.kotlinJsPlainObject)

    webMainImplementation(libs.coroutines.core)

    webTestImplementation(libs.kotlin.test)
}
