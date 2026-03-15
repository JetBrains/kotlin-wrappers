plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinBrowser)

    webMainApi(npm(jspkg.floatingUi.utils))
}
