plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    commonMainApi(projects.kotlinJs)
    commonMainApi(projects.kotlinBrowser)
    commonMainApi(projects.kotlinCesiumEngine)

    commonMainApi(npm(jspkg.cesium.widgets))
}
