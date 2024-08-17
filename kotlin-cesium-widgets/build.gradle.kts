plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinBrowser)
    jsMainApi(projects.kotlinCesiumEngine)

    jsMainApi(npm(libs.npm.cesium.widgets))
}
