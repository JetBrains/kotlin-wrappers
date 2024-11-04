plugins {
    `kotlin-legacy-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinReactLegacy)
    jsMainApi(projects.kotlinReactDom)

    jsMainApi(libs.kotlinx.html)
}
