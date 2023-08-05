plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(project(":kotlin-js"))
    jsMainApi(project(":kotlin-react-core"))

    jsTestImplementation(kotlin("test-js"))
}
