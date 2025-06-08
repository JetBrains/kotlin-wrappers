plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    commonMainApi(projects.kotlinJs)
    commonMainApi(projects.kotlinWeb)

    commonMainImplementation(libs.coroutines.core)

    commonMainApi(devNpm(jspkg.types.node))

    commonTestImplementation(libs.kotlin.test)
    commonTestImplementation(libs.coroutines.test)
}
