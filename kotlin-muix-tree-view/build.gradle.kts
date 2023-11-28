plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(projects.kotlinMuiMaterial)

    jsMainApi(npmv("@mui/x-tree-view"))
}
