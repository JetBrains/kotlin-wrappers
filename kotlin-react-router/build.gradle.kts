plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
    id("io.github.sgrishchenko.karakum")
}

dependencies {
    jsMainApi(project(":kotlin-browser"))
    jsMainApi(project(":kotlin-remix-run-router"))
    jsMainApi(project(":kotlin-react-core"))

    jsMainApi(npmv("react-router"))
}
