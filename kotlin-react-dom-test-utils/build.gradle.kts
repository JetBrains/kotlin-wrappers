plugins {
    `kotlin-library-conventions`
}

dependencies {
    commonMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinBrowser)
    jsMainApi(projects.kotlinReact)
    jsMainApi(projects.kotlinReactDom)

    commonMainImplementation(libs.coroutines.core)
    commonMainImplementation(libs.coroutines.test)

    jsMainApi(npm(libs.npm.reactDom))
}
