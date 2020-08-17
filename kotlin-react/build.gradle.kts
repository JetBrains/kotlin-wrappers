plugins {
    kotlin("js")
    `publishing-conventions`
}

dependencies {
    api(project(":kotlin-extensions"))

    api(kotlinxCoroutines("core"))

    api(npm("react", npmVersion("react")))
}
