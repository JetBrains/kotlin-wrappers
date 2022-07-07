plugins {
    kotlin("js")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    api(project(":kotlin-js"))
    api(project(":kotlin-react-core"))

    api(npmv("@tanstack/virtual-core"))
    api(npmv("@tanstack/react-virtual"))
}
