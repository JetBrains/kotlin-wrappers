plugins {
    kotlin("js")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    api(project(":kotlin-csstype"))
    api(project(":kotlin-react-core"))

    api(npmv("@emotion/css"))
}
