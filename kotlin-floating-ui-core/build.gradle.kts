plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinJs)
    webMainApi(projects.kotlinFloatingUiUtils)

    webMainApi(npm(jspkg.floatingUi.core))
}
