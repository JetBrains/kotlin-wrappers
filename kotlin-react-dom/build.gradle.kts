plugins {
    kotlin("js")
    `publishing-conventions`
}

dependencies {
    api(project(":kotlin-extensions"))
    api(project(":kotlin-react"))

    api(kotlinxHtml("js"))

    api(npm("react-dom", npmVersion("react-dom")))
}
