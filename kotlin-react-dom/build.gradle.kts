plugins {
    `kotlin-library-conventions`
}

dependencies {
    commonMainApi(projects.kotlinJs)
    commonMainApi(projects.kotlinBrowser)
    jsMainApi(projects.kotlinReactCore)

    commonMainApi(npm(libs.npm.reactDom))
}
