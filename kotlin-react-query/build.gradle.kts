plugins {
    kotlin("js")
    `publish-conventions`
}

dependencies {
    api(project(":kotlin-react"))

    implementation(npmv("react-query"))
}
