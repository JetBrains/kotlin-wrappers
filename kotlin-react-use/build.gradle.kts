plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(project(":kotlin-react"))

    jsMainImplementation(kotlinxCoroutines("core"))
}
