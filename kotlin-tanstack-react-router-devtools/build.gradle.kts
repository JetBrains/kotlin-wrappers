plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinBrowser)
        api(projects.kotlinReact)
        api(projects.kotlinTanstackReactRouter)

        npm(jspkg.tanstack.reactRouterDevtools)
    }
}
