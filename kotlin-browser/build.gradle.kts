plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinCssomCore)
    jsMainApi(projects.kotlinWeb)

    jsMainImplementation(kotlinxCoroutines("core"))

    jsTestImplementation(kotlin("test-js"))
}
