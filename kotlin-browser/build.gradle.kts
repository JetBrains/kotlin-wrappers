plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinJs)
    webMainApi(projects.kotlinCssomCore)
    webMainApi(projects.kotlinWeb)
    webMainApi(libs.coroutines.core)

    commonTestImplementation(libs.kotlin.test)
}
