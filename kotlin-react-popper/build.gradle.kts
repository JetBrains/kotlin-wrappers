plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(project(":kotlin-popper"))
    jsMainApi(project(":kotlin-react-core"))

    jsMainApi(npmv("react-popper"))
}
