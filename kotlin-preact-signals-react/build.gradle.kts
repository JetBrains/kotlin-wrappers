plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    commonMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinReactCore)
    jsMainApi(projects.kotlinPreactSignalsCore)

    commonMainApi(npm(jspkg.preact.signalsReact))
}
