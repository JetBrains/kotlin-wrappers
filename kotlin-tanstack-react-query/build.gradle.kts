plugins {
    kotlin("js")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    api(project(":kotlin-react-core"))

    api(npmv("@tanstack/react-query"))
}
