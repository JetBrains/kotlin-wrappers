plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinMuiBase)

    jsMainApi(npm(libs.npm.mui.material))
}
