plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(npmv(libs.npm.actions.artifact))
    jsMainApi(npmv(libs.npm.actions.cache))
    jsMainApi(npmv(libs.npm.actions.core))
    jsMainApi(npmv(libs.npm.actions.exec))
    jsMainApi(npmv(libs.npm.actions.github))
    jsMainApi(npmv(libs.npm.actions.glob))
    jsMainApi(npmv(libs.npm.actions.http.client))
    jsMainApi(npmv(libs.npm.actions.io))
    jsMainApi(npmv(libs.npm.actions.tool.cache))

    jsMainApi(projects.kotlinNode)
}
