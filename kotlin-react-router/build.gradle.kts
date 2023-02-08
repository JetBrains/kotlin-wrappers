plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(project(":kotlin-browser"))
    jsMainApi(project(":kotlin-remix-run-router"))
    jsMainApi(project(":kotlin-react"))

    jsMainApi(npmv("react-router"))
}
