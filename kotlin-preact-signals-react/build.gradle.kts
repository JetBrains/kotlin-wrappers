plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinReact)
    jsMainApi(projects.kotlinPreactSignalsCore)

    webMainApi(npm(jspkg.preact.signalsReact))
}
