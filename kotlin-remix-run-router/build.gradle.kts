plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(project(":kotlin-browser"))

    jsMainApi(npmv("@remix-run/router"))
}
