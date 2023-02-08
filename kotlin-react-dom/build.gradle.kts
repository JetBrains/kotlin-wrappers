plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(project(":kotlin-js"))
    jsMainApi(project(":kotlin-browser"))
    jsMainApi(project(":kotlin-react-core"))

    jsMainApi(npmv("react-dom"))
}
