plugins {
    `kotlin-conventions`
    `publish-conventions`
    seskar()
}

dependencies {
    jsMainApi(projects.kotlinEmotion)
    jsMainApi(projects.kotlinReact)
    jsMainApi(projects.kotlinReactDom)

    jsMainImplementation(seskarCore())

    jsMainApi(npmv("react-select"))
}
