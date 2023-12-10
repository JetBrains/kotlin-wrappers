plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinCssomCore)
    jsMainApi(projects.kotlinWeb)

    jsTestImplementation(kotlin("test-js"))
}
