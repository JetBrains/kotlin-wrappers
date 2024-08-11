plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinJs)

    jsMainImplementation(libs.coroutines.core)

    jsTestImplementation(libs.coroutines.test)
    jsTestImplementation(libs.kotlin.test.js)
}
