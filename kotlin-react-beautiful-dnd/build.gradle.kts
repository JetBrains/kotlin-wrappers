plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinReactCore)
    jsMainApi(projects.kotlinReactDom)

    jsMainApi(npm(libs.npm.reactBeautifulDnd))
}
