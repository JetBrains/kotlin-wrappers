plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinReactLegacy)
    jsMainApi(projects.kotlinReactDom)

    jsMainImplementation(npmv("@jetbrains/ring-ui"))
}
