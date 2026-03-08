plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinJs)
    webMainApi(projects.kotlinBrowser)

    webMainApi(npm(jspkg.testingLibrary.userEvent))

    webTestImplementation(libs.kotlin.test)
    webTestImplementation(libs.coroutines.test)
}
