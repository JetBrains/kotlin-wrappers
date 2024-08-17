plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinMuiSystem)
    jsMainApi(projects.kotlinPopperjsCore)

    jsMainApi(npm(libs.npm.mui.base))
}
