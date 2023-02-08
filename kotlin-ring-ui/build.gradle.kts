plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(project(":kotlin-react-legacy"))
    jsMainApi(project(":kotlin-react-dom"))

    jsMainImplementation(npmv("@jetbrains/ring-ui"))
}
