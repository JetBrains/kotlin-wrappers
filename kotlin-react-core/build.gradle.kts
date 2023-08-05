plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(project(":kotlin-js"))
    jsMainApi(project(":kotlin-csstype"))

    jsTestImplementation(kotlin("test-js"))

    jsMainApi(npmv("react"))
}
