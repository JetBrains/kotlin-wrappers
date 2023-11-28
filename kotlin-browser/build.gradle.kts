plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
    seskar()
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinCssomCore)
    jsMainApi(projects.kotlinWeb)

    jsMainImplementation(seskarCore())

    jsTestImplementation(kotlin("test-js"))
}
