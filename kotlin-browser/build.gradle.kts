plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(project(":kotlin-js"))
    jsMainApi(project(":kotlin-cssom-core"))
    jsMainApi(project(":kotlin-web"))

    jsMainImplementation(seskarCore())

    jsTestImplementation(kotlin("test-js"))
}
