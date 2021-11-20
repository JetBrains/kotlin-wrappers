plugins {
    kotlin("js")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    api(project(":kotlin-history"))
    api(project(":kotlin-react-dom"))

    api(npmv("react-router-dom"))
}
