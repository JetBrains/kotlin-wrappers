plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinEmotion)
    jsMainApi(projects.kotlinReact)
    jsMainApi(projects.kotlinReactDom)

    jsMainApi(npm(libs.npm.reactSelect))
}
