plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinEmotion)
    jsMainApi(projects.kotlinReact)
    jsMainApi(projects.kotlinReactDom)

    jsMainApi(npmv(libs.npm.react.select))
}
