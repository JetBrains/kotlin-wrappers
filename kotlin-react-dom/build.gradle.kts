plugins {
    kotlin("js")
    `publishing-conventions`
}

dependencies {
    implementation(project(":kotlin-extensions"))
    implementation(project(":kotlin-react"))

    implementation(kotlinxHtml("js"))

    implementation(npm("react-dom", npmVersion("react-dom")))
}
