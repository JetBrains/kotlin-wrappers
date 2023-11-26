plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
    seskar()
}

dependencies {
    jsMainApi(project(":kotlin-react-core"))
    jsMainApi(project(":kotlin-tanstack-query-core"))

    jsMainImplementation(seskarCore())

    jsMainApi(npmv("@tanstack/react-query"))
}
