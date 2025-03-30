plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinReactCore)
    jsMainApi(projects.kotlinTanstackQueryCore)

    commonMainApi(npm(libs.npm.tanstack.reactQuery))
}
