plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinJs)
    webMainApi(projects.kotlinBrowser)
    webMainApi(projects.kotlinCesiumEngine)

    webMainApi(npm(jspkg.cesium.widgets))
}
