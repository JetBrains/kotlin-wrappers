plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinReactCore)
    jsMainApi(projects.kotlinPreactSignalsCore)

    jsMainApi(npm(libs.npm.preact.signalsReact))
}
