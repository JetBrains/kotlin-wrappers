plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinBrowser)
        api(projects.kotlinCsstype)
        api(libs.coroutines.core)

        npm(jspkg.react)
    }

    sourceSets.webTest.dependencies {
        implementation(libs.kotlin.test)
        implementation(libs.coroutines.test)
    }
}
