plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinJs)
    webMainApi(projects.kotlinCssomCore)
    webMainApi(projects.kotlinWeb)

    webMainImplementation(libs.coroutines.core)

    commonTestImplementation(libs.kotlin.test)
}
