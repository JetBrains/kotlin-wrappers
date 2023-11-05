plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
    seskar()
}

dependencies {
    jsMainApi(project(":kotlin-js"))

    jsMainImplementation(seskarCore())

    jsMainApi(npmv("@tanstack/table-core"))
}
