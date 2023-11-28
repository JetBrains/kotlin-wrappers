plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinCsstype)

    jsTestImplementation(kotlin("test-js"))

    jsMainApi(npmv("react"))
}
