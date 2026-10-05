plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain {
        kotlin.srcDir(rootDir.resolve("kotlin-cesium-core/src/webMain/generated"))
    }

    sourceSets.webMain.dependencies {
        api(projects.kotlinJs)
        api(projects.kotlinBrowser)

        npm(jspkg.cesium.engine)
    }
}
