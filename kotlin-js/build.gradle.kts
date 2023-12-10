plugins {
    `kotlin-library-conventions`
    seskar()
}

dependencies {
    jsMainImplementation(kotlinxCoroutines("core"))
    jsMainImplementation(seskarCore())

    jsTestImplementation(kotlinxCoroutines("test"))
    jsTestImplementation(kotlin("test-js"))
}
