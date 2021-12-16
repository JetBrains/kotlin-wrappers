plugins {
    kotlin("js")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    api(project(":kotlin-extensions"))
    api(project(":kotlin-react-legacy"))
    api(project(":kotlin-redux"))

    api(npmv("react-redux"))
}
