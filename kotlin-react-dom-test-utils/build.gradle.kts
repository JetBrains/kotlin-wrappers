plugins {
    `kotlin-library-conventions`
}

dependencies {
    commonMainApi(projects.kotlinJs)
    commonMainApi(projects.kotlinBrowser)
    jsMainApi(projects.kotlinReact)
    jsMainApi(projects.kotlinReactDom)

    commonMainImplementation(libs.coroutines.core)
    commonMainImplementation(libs.coroutines.test)

    commonMainApi(npm(libs.npm.reactDom))
}
