plugins {
    id("kotlin-library-conventions")
}

dependencies {
    commonMainApi(projects.kotlinBrowser)
    commonMainApi(projects.kotlinEmotionUtils)

    commonMainApi(npm(libs.npm.emotion.cache))
}
