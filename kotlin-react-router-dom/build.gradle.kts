plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
    karakum()
}

dependencies {
    jsMainApi(projects.kotlinBrowser)
    jsMainApi(projects.kotlinReactRouter)
    jsMainApi(projects.kotlinReactDom)

    jsMainApi(npmv("react-router-dom"))
}
