plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinJs)

    jsMainImplementation(kotlinxCoroutines("core"))

    jsTestImplementation(kotlinxCoroutines("test"))
    jsTestImplementation(kotlin("test-js"))
}
