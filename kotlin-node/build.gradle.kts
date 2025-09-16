plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinJs)
    webMainApi(projects.kotlinWeb)

    webMainImplementation(libs.coroutines.core)

    webMainApi(devNpm(jspkg.types.node))

    webTestImplementation(libs.kotlin.test)
    webTestImplementation(libs.coroutines.test)
}
