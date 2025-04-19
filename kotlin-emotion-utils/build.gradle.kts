plugins {
    id("kotlin-library-conventions")
}

dependencies {
    commonMainApi(projects.kotlinBrowser)

    commonMainApi(npm(libs.npm.emotion.utils))
}
