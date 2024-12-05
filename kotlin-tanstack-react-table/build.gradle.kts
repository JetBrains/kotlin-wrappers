plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinReactCore)
    // TODO: remove after migration on React 19
    jsMainApi(projects.kotlinReactDom)
    jsMainApi(projects.kotlinTanstackTableCore)

    jsMainApi(npm(libs.npm.tanstack.reactTable))
}
