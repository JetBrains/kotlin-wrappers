plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(project(":kotlin-mui-base"))
    jsMainApi(project(":kotlin-mui-system"))
    jsMainApi(project(":kotlin-react-dom"))

    jsMainApi(npmv("@mui/material"))
    jsMainApi(npmv("@mui/lab"))
    jsMainApi(npmv("@mui/x-date-pickers"))
}
