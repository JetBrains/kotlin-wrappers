plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(projects.kotlinMuiSystem)
    jsMainApi(projects.kotlinPopper)

    jsMainApi(npmv("@mui/base"))
}
