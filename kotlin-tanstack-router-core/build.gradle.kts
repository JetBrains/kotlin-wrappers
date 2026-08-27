plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinBrowser)
        api(projects.kotlinTanstackHistory)

        implementation(libs.coroutines.core)

        npm(jspkg.tanstack.routerCore)
    }
}
