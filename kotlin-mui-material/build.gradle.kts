plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinMuiBase)

    jsMainApi(npmv("@mui/material"))
}
