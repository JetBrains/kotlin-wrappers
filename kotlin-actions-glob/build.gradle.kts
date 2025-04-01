plugins {
    `kotlin-library-conventions`
}

dependencies {
    commonMainApi(projects.kotlinJs)

    commonMainApi(npm(libs.npm.actions.glob))
}
