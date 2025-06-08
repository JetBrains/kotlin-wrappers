plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    commonMainApi(projects.kotlinCsstype)
    commonMainApi(projects.kotlinBrowser)
    commonMainApi(projects.kotlinEmotionCss)
    commonMainApi(projects.kotlinEmotionUtils)
    commonMainApi(projects.kotlinReactCore)

    commonMainApi(npm(jspkg.emotion.react))
}
