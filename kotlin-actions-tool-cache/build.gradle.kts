plugins {
    id("kotlin-library-conventions")
}

dependencies {
    commonMainApi(projects.kotlinNode)

    commonMainApi(npm(libs.npm.actions.toolCache))
}
