plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    jsMainApi(projects.kotlinBrowser)
    jsMainApi(projects.kotlinCsstype)
    jsMainApi(libs.coroutines.core)

    webTestImplementation(libs.kotlin.test)
    webTestImplementation(libs.coroutines.test)

    webMainApi(npm(jspkg.react))
}
