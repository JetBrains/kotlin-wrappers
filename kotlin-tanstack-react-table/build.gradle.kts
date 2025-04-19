plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    jsMainApi(projects.kotlinReactCore)
    jsMainApi(projects.kotlinTanstackTableCore)

    commonMainApi(npm(libs.npm.tanstack.reactTable))
}
