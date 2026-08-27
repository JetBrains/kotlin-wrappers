plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinBrowser)
        api(projects.kotlinReact)
        api(projects.kotlinTanstackReactRouter)

        api(npm(jspkg.tanstack.reactRouterDevtools))
    }
}
