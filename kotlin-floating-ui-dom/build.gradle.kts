plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinBrowser)
    webMainApi(projects.kotlinFloatingUiCore)
    webMainApi(projects.kotlinFloatingUiUtils)

    webMainApi(npm(jspkg.floatingUi.dom))
}
