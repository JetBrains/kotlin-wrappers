plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(projects.kotlinMuiMaterial)
    jsMainApi(projects.kotlinMuixTreeView)

    jsMainApi(npmv("@mui/lab"))
}
