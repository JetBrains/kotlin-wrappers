plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinReactDom)

    jsMainApi(npmv(libs.npm.mui.system))
}
