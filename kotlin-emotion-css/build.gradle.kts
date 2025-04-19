plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    commonMainApi(projects.kotlinCsstype)
    commonMainApi(projects.kotlinBrowser)
    commonMainApi(projects.kotlinEmotionUtils)

    commonMainApi(npm(libs.npm.emotion.css))
}
