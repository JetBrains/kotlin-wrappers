plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinJs)

        implementation(projects.kotlinJsPlainObject)

        implementation(libs.coroutines.core)
    }

    sourceSets.webTest.dependencies {
        implementation(libs.kotlin.test)
        implementation(libs.coroutines.test)
        implementation(projects.kotlinJsTest)
    }
}
