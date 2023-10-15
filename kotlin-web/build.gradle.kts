plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
    seskar()
}

dependencies {
    jsMainApi(project(":kotlin-js"))

    jsMainImplementation(kotlinxCoroutines("core"))
    jsMainImplementation(seskarCore())
}
