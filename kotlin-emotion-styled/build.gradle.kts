plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    commonMainApi(projects.kotlinCsstype)
    commonMainApi(projects.kotlinEmotionReact)
    commonMainApi(projects.kotlinReactCore)

    commonMainApi(npm(libs.npm.emotion.styled))
}
