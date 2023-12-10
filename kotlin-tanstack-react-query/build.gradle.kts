plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinReactCore)
    jsMainApi(projects.kotlinTanstackQueryCore)

    jsMainApi(npmv("@tanstack/react-query"))
}
