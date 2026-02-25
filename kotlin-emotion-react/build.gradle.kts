plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinCsstype)
    webMainApi(projects.kotlinBrowser)
    webMainApi(projects.kotlinEmotionCss)
    webMainApi(projects.kotlinEmotionUtils)
    webMainApi(projects.kotlinReact)

    webMainApi(npm(jspkg.emotion.react))
}
