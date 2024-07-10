plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinCsstype)

    jsMainImplementation(kotlinxCoroutines("core"))

    jsTestImplementation(kotlin("test-js"))

    jsMainApi(npmv("react"))
}
