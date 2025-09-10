plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinBrowser)
    webMainApi(projects.kotlinEmotionUtils)

    webMainApi(npm(jspkg.emotion.cache))
}
