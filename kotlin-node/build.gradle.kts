plugins {
    kotlin("js")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    api(project(":kotlin-extensions"))

    api(devNpmv("@types/node"))
}
