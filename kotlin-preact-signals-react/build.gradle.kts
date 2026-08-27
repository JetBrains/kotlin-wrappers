plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinJs)
        api(projects.kotlinReact)
        api(projects.kotlinPreactSignalsCore)

        npm(jspkg.preact.signalsReact)
    }
}
