plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(project(":kotlin-react-dom"))

    jsMainApi(npmv("@mui/system"))
}
