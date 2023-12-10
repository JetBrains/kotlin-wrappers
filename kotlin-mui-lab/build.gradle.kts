plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinMuiMaterial)
    jsMainApi(projects.kotlinMuixTreeView)

    jsMainApi(npmv("@mui/lab"))
}
