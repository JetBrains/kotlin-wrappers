plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(project(":kotlin-mui-material"))

    jsMainApi(npmv("@mui/x-date-pickers"))
}
