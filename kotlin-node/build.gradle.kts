plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinJs)
        api(projects.kotlinWeb)

        implementation(libs.coroutines.core)

        api(devNpm(jspkg.types.node))
    }

    sourceSets.webTest.dependencies {
        implementation(libs.kotlin.test)
        implementation(libs.coroutines.test)
    }
}
