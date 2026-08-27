plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinJs)
        api(projects.kotlinReact)
        api(projects.kotlinReactDom)
        api(projects.kotlinTestingLibraryDom)

        api(npm(jspkg.testingLibrary.react))
    }
}
