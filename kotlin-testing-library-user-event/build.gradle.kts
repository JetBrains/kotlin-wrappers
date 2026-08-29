plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinJs)
        api(projects.kotlinBrowser)

        npm(jspkg.testingLibrary.userEvent)
    }

    sourceSets.webTest.dependencies {
        implementation(libs.kotlin.test)
        implementation(libs.coroutines.test)
    }
}
