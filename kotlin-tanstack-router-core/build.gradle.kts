plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinBrowser)
        api(projects.kotlinTanstackHistory)

        implementation(libs.coroutines.core)

        api(npm(jspkg.tanstack.routerCore))
    }
}
