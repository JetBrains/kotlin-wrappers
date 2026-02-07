plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinJs)
    webMainApi(projects.kotlinReact)
    webMainApi(projects.kotlinReactDom)
    webMainApi(projects.kotlinTestingLibraryDom)

    webMainApi(npm(jspkg.testingLibrary.dom))
}
