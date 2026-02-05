plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinJs)
    webMainApi(projects.kotlinBrowser)

    webMainApi(npm(jspkg.testingLibrary.dom))
}
