plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinJs)
        api(projects.kotlinBrowser)

        api(npm(jspkg.testingLibrary.userEvent))
    }

    sourceSets.webMain.dependencies {
        implementation(libs.kotlin.test)
        implementation(libs.coroutines.test)
    }
}
