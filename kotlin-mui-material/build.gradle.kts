plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(project(":kotlin-mui-base"))

    jsMainApi(npmv("@mui/material"))
}
