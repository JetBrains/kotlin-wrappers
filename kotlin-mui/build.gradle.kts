plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(project(":kotlin-muix-tree-view"))
    jsMainApi(project(":kotlin-react-dom"))
    jsMainApi(project(":kotlin-popper"))

    jsMainApi(npmv("@mui/material"))
    jsMainApi(npmv("@mui/lab"))
    jsMainApi(npmv("@mui/x-date-pickers"))
}
