plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinJs)
    webMainApi(projects.kotlinReact)
    webMainApi(projects.kotlinPreactSignalsCore)

    webMainApi(npm(jspkg.preact.signalsReact))
}
