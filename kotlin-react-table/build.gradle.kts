plugins {
    kotlin("js")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    api(project(":kotlin-extensions"))
    api(project(":kotlin-react-core"))
    api(project(":kotlin-react-dom"))

    api(npmv("react-table"))
}
