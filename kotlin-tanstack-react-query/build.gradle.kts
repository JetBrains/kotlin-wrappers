plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(project(":kotlin-react-core"))
    jsMainApi(project(":kotlin-tanstack-query-core"))

    jsMainApi(npmv("@tanstack/react-query"))
}
