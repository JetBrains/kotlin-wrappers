plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainImplementation(kotlinxCoroutines("core"))

    jsTestImplementation(kotlinxCoroutines("test"))
    jsTestImplementation(kotlin("test-js"))
}
