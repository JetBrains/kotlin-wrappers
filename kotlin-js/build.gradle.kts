plugins {
    `kotlin-conventions`
    `publish-conventions`
    seskar()
}

dependencies {
    jsMainImplementation(kotlinxCoroutines("core"))
    jsMainImplementation(seskarCore())

    jsTestImplementation(kotlinxCoroutines("test"))
    jsTestImplementation(kotlin("test-js"))
}
