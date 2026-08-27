plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinActionsHttpClient)
        api(projects.kotlinJs)

        api(npm(jspkg.actions.cache))
    }
}
