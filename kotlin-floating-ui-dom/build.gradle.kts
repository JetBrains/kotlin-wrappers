plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinBrowser)
        api(projects.kotlinFloatingUiCore)
        api(projects.kotlinFloatingUiUtils)

        api(npm(jspkg.floatingUi.dom))
    }
}
