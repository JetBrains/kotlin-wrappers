plugins {
    `kotlin-library-conventions`
}

dependencies {
    commonMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinReactCore)
    jsMainApi(projects.kotlinPreactSignalsCore)

    commonMainApi(npm(libs.npm.preact.signalsReact))
}
