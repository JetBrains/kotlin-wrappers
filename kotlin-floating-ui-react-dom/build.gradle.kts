plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinReact)
    webMainApi(projects.kotlinFloatingUiUtils)
    webMainApi(npm(jspkg.floatingUi.reactDom))
}
