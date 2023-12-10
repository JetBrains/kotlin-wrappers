plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainImplementation(kotlinxCoroutines("core"))

    jsTestImplementation(kotlinxCoroutines("test"))
    jsTestImplementation(kotlin("test-js"))
}
