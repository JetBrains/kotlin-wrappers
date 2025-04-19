plugins {
    id("kotlin-library-conventions")
}

dependencies {
    commonMainApi(projects.kotlinJs)
    commonMainApi(projects.kotlinBrowser)
    commonMainApi(projects.kotlinCesiumEngine)

    commonMainApi(npm(libs.npm.cesium.widgets))
}
