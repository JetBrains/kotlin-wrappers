plugins {
    `kotlin-library-conventions`
    karakum()
    seskar()
}

dependencies {
    jsMainApi(projects.kotlinBrowser)
    jsMainApi(projects.kotlinRemixRunRouter)
    jsMainApi(projects.kotlinReactCore)

    jsMainImplementation(seskarCore())

    jsMainApi(npmv("react-router"))
}
