plugins {
    `kotlin-library-conventions`
}

dependencies {
    commonMainApi(projects.kotlinJs)
    commonMainApi(projects.kotlinCssomCore)
    commonMainApi(projects.kotlinWeb)

    commonMainImplementation(libs.coroutines.core)

    jsTestImplementation(libs.kotlin.test)
}
