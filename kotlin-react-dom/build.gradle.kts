plugins {
    kotlin("js")
    `publishing-conventions`
}

dependencies {
    implementation(project(":kotlin-extensions"))
    implementation(project(":kotlin-react"))

    implementation(npm("react-dom", "^16.13.1"))
}
