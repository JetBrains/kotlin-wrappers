plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainImplementation(libs.coroutines.core)

    jsTestImplementation(libs.coroutines.test)
    jsTestImplementation(libs.kotlin.testJs)
}
