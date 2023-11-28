plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
    seskar()
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinBrowser)
    jsMainApi(projects.kotlinReactCore)

    jsMainImplementation(seskarCore())

    jsMainApi(npmv("react-dom"))
}
