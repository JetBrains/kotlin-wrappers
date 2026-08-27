plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinReact)
        api(projects.kotlinTanstackTableCore)

        npm(jspkg.tanstack.reactTable)
    }
}
