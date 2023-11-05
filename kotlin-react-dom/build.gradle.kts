plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
    seskar()
}

dependencies {
    jsMainApi(project(":kotlin-js"))
    jsMainApi(project(":kotlin-browser"))
    jsMainApi(project(":kotlin-react-core"))

    jsMainImplementation(seskarCore())

    jsMainApi(npmv("react-dom"))
}
