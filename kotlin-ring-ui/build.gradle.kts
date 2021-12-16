plugins {
    kotlin("js")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    api(project(":kotlin-react-legacy"))
    api(project(":kotlin-react-dom"))

    implementation(npmv("@jetbrains/ring-ui"))
}
