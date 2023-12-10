plugins {
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(projects.kotlinMuiBase)

    jsMainApi(npmv("@mui/material"))
}
