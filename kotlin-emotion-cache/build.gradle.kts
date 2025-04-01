plugins {
    `kotlin-library-conventions`
}

dependencies {
    commonMainApi(npm(libs.npm.emotion.cache))
}
