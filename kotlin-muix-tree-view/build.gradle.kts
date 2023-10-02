plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(project(":kotlin-mui-system"))

    jsMainApi(npmv("@mui/x-tree-view"))
}
