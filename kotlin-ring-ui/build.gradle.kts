plugins {
    kotlin("js")
    `publish-conventions`
}

dependencies {
    api(project(":kotlin-react-dom"))

    implementation(npm("@jetbrains/ring-ui", version("ring-ui")))
}
