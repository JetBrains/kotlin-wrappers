plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinReact)

        npm(jspkg.tanstack.reactQueryDevtools)
    }
}
