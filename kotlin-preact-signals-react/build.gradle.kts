plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinJs)
        api(projects.kotlinReact)
        api(projects.kotlinPreactSignalsCore)

        api(npm(jspkg.preact.signalsReact))
    }
}
