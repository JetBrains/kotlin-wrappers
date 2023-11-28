plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(projects.kotlinExtensions)
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinReactLegacy)
    jsMainApi(projects.kotlinReactDom)

    jsMainApi(kotlinxHtml("js"))
}
