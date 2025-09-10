plugins {
    id("wrappersbuild.kotlin-legacy-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinReactLegacy)
    jsMainApi(projects.kotlinReactDom)

    jsMainApi(libs.kotlinx.html)
}
