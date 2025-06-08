plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    commonMainApi(projects.kotlinCsstype)
    commonMainApi(projects.kotlinEmotionReact)
    commonMainApi(projects.kotlinReactCore)

    commonMainApi(npm(jspkg.emotion.styled))
}
