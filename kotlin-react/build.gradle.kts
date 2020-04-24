plugins {
    kotlin("js")
    `publishing-conventions`
}

dependencies {
    api(project(":kotlin-extensions"))

    api(kotlinxCoroutines("core"))
    api(kotlinxCoroutines("core-common"))
    api(kotlinxCoroutines("core-js"))

    api(npm("react", npmVersion("react")))
}
