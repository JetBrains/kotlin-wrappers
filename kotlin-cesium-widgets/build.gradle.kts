plugins {
    `kotlin-library-conventions`
}

dependencies {
    commonMainApi(projects.kotlinJs)
    commonMainApi(projects.kotlinBrowser)
    commonMainApi(projects.kotlinCesiumEngine)

    jsMainApi(npm(libs.npm.cesium.widgets))
}
