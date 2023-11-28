plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
}

dependencies {
    jsMainImplementation(projects.kotlinEmotion)
    jsMainImplementation(projects.kotlinJs)
    jsMainImplementation(projects.kotlinReact)
    jsMainImplementation(projects.kotlinReactDom)
    jsMainImplementation(projects.kotlinReactRouterDom)

    jsMainImplementation(npm("react-quill", "1.3.5"))
    jsMainImplementation(npm("axios", "0.21.1"))
}
