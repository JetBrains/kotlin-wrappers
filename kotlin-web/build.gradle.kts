plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    commonMainApi(projects.kotlinJs)

    commonMainImplementation(libs.coroutines.core)

    commonTestImplementation(libs.coroutines.test)
    commonTestImplementation(libs.kotlin.test)
}
