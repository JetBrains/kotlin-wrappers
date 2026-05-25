plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinBrowser)
    webMainApi(projects.kotlinCsstype)
    webMainApi(libs.coroutines.core)

    webTestImplementation(libs.kotlin.test)
    webTestImplementation(libs.coroutines.test)

    webMainApi(npm(jspkg.react))
}
