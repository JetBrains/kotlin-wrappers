plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinCssomCore)
    jsMainApi(projects.kotlinWeb)

    jsMainApi(libs.coroutines.core)

    jsTestImplementation(libs.kotlin.testJs)
}
