plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(projects.kotlinReact)

    jsMainImplementation(kotlinxCoroutines("core"))
}
