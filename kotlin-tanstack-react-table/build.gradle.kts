plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinReact)
        api(projects.kotlinTanstackTableCore)

        api(npm(jspkg.tanstack.reactTable))
    }
}
