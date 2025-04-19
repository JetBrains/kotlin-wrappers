plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    commonMainApi(projects.kotlinJs)

    commonMainApi(npm(libs.npm.preact.signalsCore))
}
