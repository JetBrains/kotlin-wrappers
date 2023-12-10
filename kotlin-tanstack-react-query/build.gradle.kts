plugins {
    `kotlin-conventions`
    `publish-conventions`
    seskar()
}

dependencies {
    jsMainApi(projects.kotlinReactCore)
    jsMainApi(projects.kotlinTanstackQueryCore)

    jsMainImplementation(seskarCore())

    jsMainApi(npmv("@tanstack/react-query"))
}
