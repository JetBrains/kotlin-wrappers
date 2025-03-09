plugins {
    `kotlin-library-conventions`
}

dependencies {
    commonMainApi(projects.kotlinJs)
    commonMainApi(projects.kotlinCssomCore)
    commonMainApi(projects.kotlinWeb)

    commonMainImplementation(libs.coroutines.core)
    commonMainImplementation(libs.seskar.core)

    jsTestImplementation(libs.kotlin.test)
}
