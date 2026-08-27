plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinCssomCore)
        api(projects.kotlinJs)
        api(projects.kotlinBrowser)

        api(devNpm(jspkg.csstype))
    }
}
