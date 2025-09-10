plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinCsstype)
    webMainApi(projects.kotlinEmotionReact)
    webMainApi(projects.kotlinReactCore)

    webMainApi(npm(jspkg.emotion.styled))
}
