plugins {
    kotlin("js")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    api(project(":kotlin-react-core"))
    api(project(":kotlin-tanstack-table-core"))

    api(npmv("@tanstack/react-table"))
}
