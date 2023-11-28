plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
    karakum()
}

dependencies {
    jsMainApi(projects.kotlinBrowser)
    jsMainApi(projects.kotlinRemixRunRouter)
    jsMainApi(projects.kotlinReactCore)

    jsMainApi(npmv("react-router"))
}
