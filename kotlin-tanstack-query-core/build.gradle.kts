plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    commonMainApi(projects.kotlinBrowser)

    commonMainApi(npm(libs.npm.tanstack.queryCore))
}
