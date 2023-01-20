plugins {
    kotlin("js")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    api(project(":kotlin-browser"))
    api(project(":kotlin-remix-run-router"))

    api(npmv("react-router"))
}
