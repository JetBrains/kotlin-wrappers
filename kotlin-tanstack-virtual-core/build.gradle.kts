plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
    seskar()
}

dependencies {
    jsMainApi(project(":kotlin-js"))
    jsMainApi(project(":kotlin-browser"))

    jsMainImplementation(seskarCore())

    jsMainApi(npmv("@tanstack/virtual-core"))
}
