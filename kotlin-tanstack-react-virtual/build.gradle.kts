plugins {
    kotlin("js")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    api(npmv("@tanstack/virtual-core"))
    api(npmv("@tanstack/react-virtual"))
}
