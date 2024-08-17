plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinReactDom)

    jsMainApi(npm(libs.npm.mui.system))
}
