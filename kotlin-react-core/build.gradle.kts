plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinCsstype)

    jsMainApi(kotlinxCoroutines("core"))

    jsTestImplementation(kotlin("test-js"))
    jsTestImplementation(kotlinxCoroutines("test"))

    jsMainApi(npmv("react"))
}
