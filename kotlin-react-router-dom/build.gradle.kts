plugins {
    kotlin("js")
    `publishing-conventions`
}

dependencies {
    implementation(project(":kotlin-extensions"))
    implementation(project(":kotlin-react"))

    implementation(npm("react-router-dom", "^5.1.2"))
}
