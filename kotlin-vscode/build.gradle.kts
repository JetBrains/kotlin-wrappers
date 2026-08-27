plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinJs)

        implementation(projects.kotlinJsPlainObject)

        implementation(libs.coroutines.core)
    }
}
