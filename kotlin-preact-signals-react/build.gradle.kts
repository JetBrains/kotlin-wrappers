plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinReactCore)
    jsMainApi(projects.kotlinPreactSignalsCore)

    jsMainApi(npmv(libs.npm.preact.signals.react))
}
