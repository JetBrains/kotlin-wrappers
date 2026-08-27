plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinJs)
        api(projects.kotlinFloatingUiUtils)

        npm(jspkg.floatingUi.core)
    }
}
