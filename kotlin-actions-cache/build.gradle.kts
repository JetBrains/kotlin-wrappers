plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinActionsHttpClient)
    webMainApi(projects.kotlinJs)

    webMainApi(npm(jspkg.actions.cache))
}
