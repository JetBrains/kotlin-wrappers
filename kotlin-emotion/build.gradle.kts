plugins {
    kotlin("js")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    api(project(":kotlin-csstype"))
    api(project(":kotlin-browser"))
    api(project(":kotlin-react-core"))

    api(npmv("@emotion/css"))
    api(npmv("@emotion/react"))
    api(npmv("@emotion/styled"))
}
