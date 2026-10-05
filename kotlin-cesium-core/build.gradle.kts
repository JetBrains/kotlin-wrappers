plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain {
        // compiled by `kotlin-cesium-engine` until core no longer depends on engine types
        kotlin.setSrcDirs(emptyList<File>())
    }

    sourceSets.webMain.dependencies {
        api(projects.kotlinJs)
        api(projects.kotlinBrowser)

        npm(jspkg.cesium.core)
    }
}
