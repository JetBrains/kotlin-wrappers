plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinJs)
        api(projects.kotlinBrowser)

        implementation(projects.kotlinJsPlainObject)

        api(npm(jspkg.popperjs.core))
    }
}
