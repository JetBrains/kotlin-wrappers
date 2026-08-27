plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinNode)
        api(projects.kotlinBrowser)

        api(npm(jspkg.electron))
    }
}
