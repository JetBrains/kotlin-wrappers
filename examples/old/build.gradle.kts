plugins {
    `kotlin-conventions`
}

dependencies {
    jsMainImplementation(projects.kotlinEmotion)
    jsMainImplementation(projects.kotlinJs)
    jsMainImplementation(projects.kotlinReact)
    jsMainImplementation(projects.kotlinReactUse)
    jsMainImplementation(projects.kotlinReactDom)
    jsMainImplementation(projects.kotlinReactRouterDom)
}
