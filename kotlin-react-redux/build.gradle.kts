plugins {
    kotlin("js")
    `publish-conventions`
}

dependencies {
    api(project(":kotlin-extensions"))
    api(project(":kotlin-react"))
    api(project(":kotlin-redux"))

    api(npmv("react-redux"))
}
