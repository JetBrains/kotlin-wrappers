plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinMuiMaterial)

    commonMainApi(npm(libs.npm.mui.xTreeView))
}
