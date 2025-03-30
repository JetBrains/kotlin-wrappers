plugins {
    `kotlin-library-conventions`
}

dependencies {
    commonMainApi(npm(libs.npm.actions.artifact))
    commonMainApi(npm(libs.npm.actions.cache))
    commonMainApi(npm(libs.npm.actions.core))
    commonMainApi(npm(libs.npm.actions.exec))
    commonMainApi(npm(libs.npm.actions.github))
    commonMainApi(npm(libs.npm.actions.glob))
    commonMainApi(npm(libs.npm.actions.httpClient))
    commonMainApi(npm(libs.npm.actions.io))
    commonMainApi(npm(libs.npm.actions.toolCache))

    jsMainApi(projects.kotlinNode)
}
