plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(project(":kotlin-browser"))
    jsMainApi(project(":kotlin-react-router"))
    jsMainApi(project(":kotlin-react-dom"))

    jsMainApi(npmv("react-router-dom"))
}
