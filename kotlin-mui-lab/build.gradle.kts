plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinMuiMaterial)
    jsMainApi(projects.kotlinMuixTreeView)

    commonMainApi(npm(libs.npm.mui.lab))
}
