plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinReactCore)
    jsMainApi(projects.kotlinTanstackTableCore)

    jsMainApi(npm(libs.npm.tanstack.reactTable))
}
