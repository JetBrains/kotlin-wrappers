plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinReactDom)
        api(projects.kotlinTanstackRouterCore)

        api(npm(jspkg.tanstack.reactRouter))
    }
}
