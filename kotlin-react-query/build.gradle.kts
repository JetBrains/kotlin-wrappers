plugins {
    kotlin("js")
    `publish-conventions`
}

dependencies {
    api(project(":kotlin-react"))

    implementation(npm("react-query", version("react-query")))
}
