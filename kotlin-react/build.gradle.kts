plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinBrowser)
        api(projects.kotlinCsstype)
        api(libs.coroutines.core)

        api(npm(jspkg.react))
    }

    sourceSets.webMain.dependencies {
        implementation(libs.kotlin.test)
        implementation(libs.coroutines.test)
    }
}
