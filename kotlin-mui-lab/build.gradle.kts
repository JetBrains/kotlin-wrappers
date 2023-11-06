plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(project(":kotlin-mui-material"))
    jsMainApi(project(":kotlin-muix-tree-view"))

    jsMainApi(npmv("@mui/lab"))
}
