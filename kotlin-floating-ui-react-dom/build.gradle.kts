plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinReact)
        api(projects.kotlinFloatingUiCore)
        api(projects.kotlinFloatingUiDom)
        api(projects.kotlinFloatingUiUtils)

        api(npm(jspkg.floatingUi.reactDom))
    }
}
