plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinBrowser)
    jsMainApi(projects.kotlinReactRouter)
    jsMainApi(projects.kotlinReactDom)

    jsMainApi(npm(libs.npm.reactRouterDom))

    jsTestImplementation(libs.kotlin.test)
}
