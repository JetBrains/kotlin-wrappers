plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinJs)
        api(projects.kotlinFloatingUiUtils)

        api(npm(jspkg.floatingUi.core))
    }
}
