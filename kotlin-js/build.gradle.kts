plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainImplementation(kotlinxCoroutines("core"))

    jsTestImplementation(kotlin("test-js"))
}
