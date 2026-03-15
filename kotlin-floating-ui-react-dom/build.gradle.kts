plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinReact)
    webMainApi(projects.kotlinFloatingUiCore)
    webMainApi(projects.kotlinFloatingUiDom)
    webMainApi(projects.kotlinFloatingUiUtils)

    webMainApi(npm(jspkg.floatingUi.reactDom))
}
