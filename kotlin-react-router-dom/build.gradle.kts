plugins {
    kotlin("js")
    `publish-conventions`
}

dependencies {
    api(project(":kotlin-extensions"))
    api(project(":kotlin-react"))

    api(npmv("react-router-dom"))
}
