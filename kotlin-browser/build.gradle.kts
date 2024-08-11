plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinCssomCore)
    jsMainApi(projects.kotlinWeb)

    jsMainImplementation(libs.coroutines.core)

    jsTestImplementation(libs.kotlin.test.js)
}
