plugins {
    kotlin("js")
    `publishing-conventions`
}

dependencies {
    implementation(project(":kotlin-extensions"))
    implementation(project(":kotlin-react"))

    implementation(npm("react-router-dom", npmVersion("react-router-dom")))
}
