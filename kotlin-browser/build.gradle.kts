plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinJs)
        api(projects.kotlinCssomCore)
        api(projects.kotlinWeb)

        implementation(projects.kotlinJsPlainObject)

        implementation(libs.coroutines.core)
    }

    sourceSets.webTest.dependencies {
        implementation(libs.kotlin.test)
    }
}
