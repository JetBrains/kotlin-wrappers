plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinReact)
        api(projects.kotlinTanstackQueryCore)

        api(npm(jspkg.tanstack.reactQuery))
    }
}
