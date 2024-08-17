plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(npm(libs.npm.actions.artifact))
    jsMainApi(npm(libs.npm.actions.cache))
    jsMainApi(npm(libs.npm.actions.core))
    jsMainApi(npm(libs.npm.actions.exec))
    jsMainApi(npm(libs.npm.actions.github))
    jsMainApi(npm(libs.npm.actions.glob))
    jsMainApi(npm(libs.npm.actions.http.client))
    jsMainApi(npm(libs.npm.actions.io))
    jsMainApi(npm(libs.npm.actions.tool.cache))

    jsMainApi(projects.kotlinNode)
}
