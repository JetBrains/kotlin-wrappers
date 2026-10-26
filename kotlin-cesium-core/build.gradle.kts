plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinJs)
        api(projects.kotlinBrowser)
        api(libs.coroutines.core)

        implementation(projects.kotlinJsPlainObject)

        npm(jspkg.cesium.core)
    }
}
