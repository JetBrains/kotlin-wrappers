plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinMuiMaterial)

    jsMainApi(npm(libs.npm.muix.date.pickers))
}
