plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinReact)

        api(npm(jspkg.tanstack.reactQueryDevtools))
    }
}
