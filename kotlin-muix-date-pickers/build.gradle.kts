plugins {
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(projects.kotlinMuiMaterial)

    jsMainApi(npmv("@mui/x-date-pickers"))
}
