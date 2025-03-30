plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinMuiSystem)
    jsMainApi(projects.kotlinPopperjsCore)

    commonMainApi(npm(libs.npm.mui.base))
}
