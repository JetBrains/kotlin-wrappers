plugins {
    `kotlin-library-conventions`
}

dependencies {
    commonMainImplementation(libs.coroutines.core)

    commonTestImplementation(libs.coroutines.test)
    commonTestImplementation(libs.kotlin.test)
}
