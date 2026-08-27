plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinJs)
        api(projects.kotlinWeb)

        npm(jspkg.tauriApps.api)
    }
}
