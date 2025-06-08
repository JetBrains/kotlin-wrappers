plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    commonMainApi(projects.kotlinBrowser)
    commonMainApi(projects.kotlinEmotionUtils)

    commonMainApi(npm(jspkg.emotion.cache))
}
