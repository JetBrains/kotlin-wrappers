plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinCsstype)

    jsMainApi(libs.coroutines.core)

    webTestImplementation(libs.kotlin.test)
    webTestImplementation(libs.coroutines.test)

    webMainApi(npm(jspkg.react))
}
