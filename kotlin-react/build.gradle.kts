plugins {
    kotlin("js")
    `publish-conventions`
}

dependencies {
    api(project(":kotlin-extensions"))

    api(npmv("react"))
}
