plugins {
    id("kotlin-library-conventions")
}

dependencies {
    jsMainApi(projects.kotlinMuiBase)

    commonMainApi(npm(libs.npm.mui.material))
}
