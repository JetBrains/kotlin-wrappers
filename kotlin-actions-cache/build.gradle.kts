plugins {
    id("kotlin-library-conventions")
}

dependencies {
    commonMainApi(projects.kotlinActionsHttpClient)
    commonMainApi(projects.kotlinJs)

    commonMainApi(npm(libs.npm.actions.cache))
}
