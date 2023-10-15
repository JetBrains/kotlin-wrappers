plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
    karakum()
}

dependencies {
    jsMainApi(project(":kotlin-browser"))

    jsMainApi(npmv("@remix-run/router"))
}
