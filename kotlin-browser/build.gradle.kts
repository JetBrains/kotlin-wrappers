plugins {
    id("kotlin-library-conventions")
}

dependencies {
    commonMainApi(projects.kotlinJs)
    commonMainApi(projects.kotlinCssomCore)
    commonMainApi(projects.kotlinWeb)

    commonMainImplementation(libs.coroutines.core)

    commonTestImplementation(libs.kotlin.test)
}
