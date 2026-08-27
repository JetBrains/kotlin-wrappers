plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinJs)
        api(projects.kotlinBrowser)
        api(projects.kotlinCesiumEngine)

        api(npm(jspkg.cesium.widgets))
    }
}
