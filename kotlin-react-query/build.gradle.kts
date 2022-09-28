plugins {
    kotlin("js")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    api(project(":kotlin-web"))
    api(project(":kotlin-react-core"))

    implementation(npmv("react-query"))
}
