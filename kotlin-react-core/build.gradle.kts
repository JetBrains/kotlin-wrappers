plugins {
    `kotlin-conventions`
    `publish-conventions`
    seskar()
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinCsstype)

    jsMainImplementation(seskarCore())

    jsTestImplementation(kotlin("test-js"))

    jsMainApi(npmv("react"))
}
