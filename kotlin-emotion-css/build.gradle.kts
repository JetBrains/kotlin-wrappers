plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinCsstype)
    webMainApi(projects.kotlinBrowser)
    webMainApi(projects.kotlinEmotionUtils)

    webMainApi(npm(jspkg.emotion.css))
}
