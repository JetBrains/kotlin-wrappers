plugins {
    kotlin("js")
    `publishing-conventions`
}

dependencies {
    api(project(":kotlin-extensions"))
    api(project(":kotlin-react"))
    api(project(":kotlin-redux"))

    api(npm("react-redux", npmVersion("react-redux")))
}
