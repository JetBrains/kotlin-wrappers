plugins {
    `kotlin-legacy-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinExtensions)
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinReactLegacy)
    jsMainApi(projects.kotlinReactDom)

    jsMainApi(libs.html.js)
}
