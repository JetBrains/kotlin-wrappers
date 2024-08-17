plugins {
    `kotlin-library-conventions`
    alias(libs.plugins.karakum)
}

dependencies {
    jsMainApi(projects.kotlinBrowser)
    jsMainApi(projects.kotlinReactRouter)
    jsMainApi(projects.kotlinReactDom)

    jsMainApi(npm(libs.npm.react.router.dom))

    jsTestImplementation(libs.kotlin.test.js)
}
