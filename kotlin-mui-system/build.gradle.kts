plugins {
    id("kotlin-library-conventions")
}

dependencies {
    jsMainApi(projects.kotlinReactDom)

    commonMainApi(npm(libs.npm.mui.system))
}
