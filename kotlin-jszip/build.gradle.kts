plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinWeb)

        implementation(projects.kotlinJsPlainObject)

        npm(jspkg.jszip)
    }
}
