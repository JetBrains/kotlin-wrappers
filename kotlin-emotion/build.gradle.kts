plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinCsstype)
    commonMainApi(projects.kotlinBrowser)
    commonMainApi(projects.kotlinEmotionCache)
    commonMainApi(projects.kotlinEmotionCss)
    commonMainApi(projects.kotlinEmotionReact)
    commonMainApi(projects.kotlinEmotionStyled)
    commonMainApi(projects.kotlinEmotionUtils)
    jsMainApi(projects.kotlinReactCore)

    commonMainApi(npm(libs.npm.emotion.cache))
    commonMainApi(npm(libs.npm.emotion.css))
    commonMainApi(npm(libs.npm.emotion.react))
    commonMainApi(npm(libs.npm.emotion.styled))
}
