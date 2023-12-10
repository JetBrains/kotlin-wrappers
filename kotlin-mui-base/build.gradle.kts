plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinMuiSystem)
    jsMainApi(projects.kotlinPopper)

    jsMainApi(npmv("@mui/base"))
}
