plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    commonMainApi(projects.kotlinActionsHttpClient)
    commonMainApi(projects.kotlinJs)

    commonMainApi(npm(jspkg.actions.cache))
}
