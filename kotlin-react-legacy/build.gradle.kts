plugins {
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(projects.kotlinExtensions)
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinReactCore)
}
