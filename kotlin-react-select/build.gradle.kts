plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinEmotion)
    jsMainApi(projects.kotlinReact)
    jsMainApi(projects.kotlinReactDom)

    commonMainApi(npm(libs.npm.reactSelect))
}
